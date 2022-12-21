@java.lang.Override
public org.openqa.selenium.WebDriver getWebDriverInstance() {
    org.openqa.selenium.WebDriver retVal = getWebDriver();
    try {
        if (null == retVal) {
            retVal = new org.openqa.selenium.safari.SafariDriver();
            setWebDriver(retVal);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return retVal;
}
