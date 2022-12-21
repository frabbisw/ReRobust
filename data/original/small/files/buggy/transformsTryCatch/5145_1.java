@org.testng.annotations.Test
public void method3(java.lang.reflect.Method method) {
    try {
        com.relevantcodes.extentreports.common.ExtentTestManager.createTest(method.getName()).error("error");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertEquals(com.relevantcodes.extentreports.common.ExtentTestManager.getTest().getRunStatus(), Status.ERROR);
}
