@org.junit.Test
public void getDriverTest() {
    try {
        driver.setPoints(10);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    driver2.setPoints(15);
    driver4.setPoints(25);
    assertEquals(driver4, season.getDriver(0));
}
