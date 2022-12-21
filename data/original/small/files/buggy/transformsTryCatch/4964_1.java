@org.junit.Before
public void TestSetUp() {
    driver = new org.openqa.selenium.firefox.FirefoxDriver();
    SelCommonElements = new PageObjects.CommonObj(driver);
    try {
        java.lang.System.out.print("Driver loaded before test");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
