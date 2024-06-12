const workerpool = require('workerpool');
const generateScreenshot = require('./servicePuppeteer.js');
const puppeteer = require('puppeteer');
const fs = require('fs');
let pages=[]
let browser;

async function initializePages() {
    browser = await puppeteer.launch({ headless: false });
    
    for (let i = 0; i < 9; i++) {
        const page = await browser.newPage();
        pages.push(page);
    }
    
}

function recieveLayers(call, callback) {

    var layerData = (call.request.htmlContent);
    
    while(pages.length===0){}
    
        let page=pages[pages.length-1];
        pages.pop();
        var s = generateScreenshot(page, layerData).then(({screenshot,page}) => {
            pages.push(page);
            
        
            var image = {
                "imageBytes": screenshot,
            }
            callback(null, image);
        });
    
}


module.exports = { recieveLayers, initializePages }