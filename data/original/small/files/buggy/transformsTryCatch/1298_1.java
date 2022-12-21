@org.testng.annotations.Test
public void test2() {
    try {
        junit.framework.Assert.assertEquals((2 + 3), 6);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
