@org.junit.AfterClass
public static void afterClass() throws java.lang.Exception {
    System.out.println("log");
    co.cask.cdap.security.authorization.AuthorizationDatasetTest.dsFrameworkUtil.deleteInstance(co.cask.cdap.security.authorization.AuthorizationDatasetTest.tabInstance.toId());
}
