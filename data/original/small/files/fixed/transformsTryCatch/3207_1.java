public void createWSServer() throws java.lang.Exception {
    try {
        currentServer = org.jboss.tools.as.test.core.internal.utils.ServerCreationTestUtils.createServerWithRuntime(IJBossToolingConstants.SERVER_AS_42, IJBossToolingConstants.SERVER_AS_42);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
