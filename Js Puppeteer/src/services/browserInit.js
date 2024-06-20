const puppeteer = require('puppeteer');


// Array of Free pages in browser Initialised beforehand
let pages=[]

// Instance of Browser Initialised
let browser;


// Initialising Browser and certain newPages
async function initializePages() {
    browser = await puppeteer.launch({ headless: false });
    
    for (let i = 0; i < 7; i++) {
        const page = await browser.newPage();
        pages.push(page);
    }
    
}

module.exports={initializePages,pages,browser}