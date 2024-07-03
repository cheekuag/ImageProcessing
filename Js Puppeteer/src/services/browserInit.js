const puppeteer = require('puppeteer');


// Array of Free pages in browser Initialised beforehand
let pages=[]

// Instance of Browser Initialised
let browser;


// Initialising Browser and certain newPages
async function initializePages() {
    console.log("Browser opened")
    browser = await puppeteer.launch({ 
        headless: true, // Run in headless mode
        executablePath: '/usr/bin/chromium',
        args: ['--no-sandbox', '--disable-setuid-sandbox'],
     });
    
    for (let i = 0; i < 17; i++) {
        const page = await browser.newPage();
        console.log("pages opened")
        pages.push(page);
    }

}


module.exports={initializePages,pages}