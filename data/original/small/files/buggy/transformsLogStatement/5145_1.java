@org.testng.annotations.Test
public void method3(java.lang.reflect.Method method) {
    com.relevantcodes.extentreports.common.ExtentTestManager.createTest(method.getName()).error("error");
    System.out.println("log");
    org.junit.Assert.assertEquals(com.relevantcodes.extentreports.common.ExtentTestManager.getTest().getRunStatus(), Status.ERROR);
}
