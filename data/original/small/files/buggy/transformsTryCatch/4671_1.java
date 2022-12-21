public org.openqa.selenium.WebDriver createWebDriver(minium.developer.config.WebDriversProperties.DeveloperWebDriverProperties webDriverProperties, boolean withRecorder) throws java.io.IOException {
    org.openqa.selenium.WebDriver webDriver = null;
    try {
        if (withRecorder) {
            webDriver = addRecorderPlugin(webDriverProperties, webDriver);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return webDriver != null ? webDriver : webDriverFactory.create(webDriverProperties);
}
