static void switchToDefaultContent() {
    try {
        com.alllxt.selenium.framework.webdriver.manager.LocalDriverManager.getDriver().switchTo().defaultContent();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
