public org.openqa.selenium.WebDriver createWebDriver(minium.developer.config.WebDriversProperties.DeveloperWebDriverProperties webDriverProperties, boolean withRecorder) throws java.io.IOException {
    org.openqa.selenium.WebDriver webDriver = null;
    System.out.println("log");
    if (withRecorder) {
        webDriver = addRecorderPlugin(webDriverProperties, webDriver);
    }
    return webDriver != null ? webDriver : webDriverFactory.create(webDriverProperties);
}
