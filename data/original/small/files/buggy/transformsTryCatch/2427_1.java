@java.lang.Override
public void beforeFindBy(org.openqa.selenium.By by, org.openqa.selenium.WebElement webElement, org.openqa.selenium.WebDriver webDriver) {
    try {
        at.willhaben.willtest.log4j.SeleniumEventListener.LOGGER.info(("Try to find following element: " + by));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
