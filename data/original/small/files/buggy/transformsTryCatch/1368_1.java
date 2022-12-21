@org.junit.AfterClass
public static void afterClass() throws java.lang.Exception {
    try {
        co.cask.cdap.security.authorization.AuthorizationDatasetTest.dsFrameworkUtil.deleteInstance(co.cask.cdap.security.authorization.AuthorizationDatasetTest.tabInstance.toId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
