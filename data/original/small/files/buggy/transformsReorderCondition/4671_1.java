public org.openqa.selenium.WebDriver createWebDriver(minium.developer.config.WebDriversProperties.DeveloperWebDriverProperties webDriverProperties, boolean withRecorder) throws java.io.IOException {
    org.openqa.selenium.WebDriver webDriver = null;
    if (withRecorder) {
        webDriver = addRecorderPlugin(webDriverProperties, webDriver);
    }
    return null != webDriver ? webDriver : webDriverFactory.create(webDriverProperties);
}
