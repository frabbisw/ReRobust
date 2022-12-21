@java.lang.Override
public void beforeFindBy(org.openqa.selenium.By by, org.openqa.selenium.WebElement webElement, org.openqa.selenium.WebDriver webDriver) {
    System.out.println("log");
    at.willhaben.willtest.log4j.SeleniumEventListener.LOGGER.info(("Try to find following element: " + by));
}
