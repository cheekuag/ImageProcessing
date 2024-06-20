

  async function generateScreenshot(page, layerData, browser) {

  // Opening newPage if not available in pages array 
  if(page===null){
    page = await browser.newPage();
  }
    // Create HTML content from layerData

    await page.setContent(layerData, { waitUntil: 'load' });

    // Set viewport size based on the layerData
    await page.setViewport({ width: 1080, height: 1080 });

    // Take screenshot
    const screenshot = await page.screenshot();

    
    return{ screenshot,page}
  }

  module.exports = generateScreenshot;