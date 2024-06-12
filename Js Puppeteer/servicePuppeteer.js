

  function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
  }

  async function generateScreenshot(page, layerData) {

  await sleep(5000);

    // Create HTML content from layerData

    await page.setContent(layerData, { waitUntil: 'load' });

    // Set viewport size based on the layerData
    await page.setViewport({ width: 1080, height: 1080 });

    // Take screenshot
    const screenshot = await page.screenshot();
    return{ screenshot,page}
  }

  module.exports = generateScreenshot;