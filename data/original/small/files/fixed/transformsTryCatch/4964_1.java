@org.junit.Before
public void TestSetUp() {
    SelCommonElements = new PageObjects.CommonObj(driver);
    try {
        java.lang.System.out.println("Driver loaded before test");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
