const generateScreenshot = require('./servicePuppeteer.js');
const { pages, browser }=require('./browserInit');

// gRPC Service Handler to recieve request from Java
function recieveLayers(call, callback) {

    console.log("request received")
    var layerData = call.request.htmlContent;
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


module.exports = { recieveLayers }