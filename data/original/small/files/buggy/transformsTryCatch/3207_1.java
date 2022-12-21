public void createWSServer() throws java.lang.Exception {
    try {
        currentServer = org.jboss.tools.as.test.core.internal.utils.ServerCreationTestUtils.createServerWithRuntime(IJBossToolingConstants.SERVER_AS_42, getClass().getName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
