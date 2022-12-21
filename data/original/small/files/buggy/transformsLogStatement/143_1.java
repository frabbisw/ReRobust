@java.lang.Override
public org.openqa.selenium.WebDriver getWebDriverInstance() {
    System.out.println("log");
    org.openqa.selenium.WebDriver retVal = getWebDriver();
    if (null == retVal) {
        retVal = new org.openqa.selenium.safari.SafariDriver();
    }
    setWebDriver(retVal);
    return retVal;
}
