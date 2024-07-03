const generateScreenshot = require('./servicePuppeteer.js');
const { pages } = require('./browserInit');

let requestQueue = [];

// Function to process requests from the queue
async function processQueue() {
    while (requestQueue.length > 0 && pages.length > 0) {
        const { call, callback } = requestQueue[requestQueue.length-1]; // Get the next request from the queue
        requestQueue.pop();
        let page = pages[pages.length-1]; // Get a page from the pool
        pages.pop();

        try {
            // Request to function handling Puppeteer
            const { screenshot, page: usedPage } = await generateScreenshot(page, call.request.htmlContent);
            
            // Add page back to the pool
            pages.push(usedPage);
            
            // Send the screenshot back to the client
            callback(null, { imageBytes: screenshot });
        } catch (error) {
            // Handle any errors
            callback(error);
        }
    }
}

// gRPC Service Handler to receive request from Java
function recieveLayers(call, callback) {
    console.log("Request received");
    
    if (pages.length > 0 && requestQueue.length === 0) {
        // If pages are available, handle the request immediately
        let page = pages[pages.length-1];

        generateScreenshot(page, call.request.htmlContent)
            .then(({ screenshot, page: usedPage }) => {
                // Add page back to the pool
                pages.push(usedPage);
                
                // Send the screenshot back to the client
                callback(null, { imageBytes: screenshot });
                
                // Process queued requests
                processQueue();
            })
            .catch(error => {
                // Handle any errors
                callback(error);
            });
    } else {
        // If no pages are available, add the request to the queue
        requestQueue.push({ call, callback });
    }
}

module.exports = { recieveLayers };




