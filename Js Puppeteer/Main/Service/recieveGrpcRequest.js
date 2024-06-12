const workerpool = require('workerpool');
const generateScreenshot = require('./servicePuppeteer.js');
const puppeteer = require('puppeteer');
const fs = require('fs');

// Array of Free pages in browser Initialised
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

// gRPC Service Handler to recieve request from Java
function recieveLayers(call, callback) {

    var layerData = (call.request.htmlContent);
    let page=null;

    if(pages.length!==0){
        page=pages[pages.length-1]; 
        pages.pop();
    }
       
    // request to function Handling Puppeteer
       generateScreenshot(page, layerData, browser)
       .then(({screenshot,page}) => {

        //adding page back to array after it is Free
            pages.push(page);
      
            var image = {
                "imageBytes": screenshot,
            }
            callback(null, image);
        });
    
}


module.exports = { recieveLayers, initializePages }