public void createWSServer() throws java.lang.Exception {
    System.out.println("log");
    currentServer = org.jboss.tools.as.test.core.internal.utils.ServerCreationTestUtils.createServerWithRuntime(IJBossToolingConstants.SERVER_AS_42, getClass().getName());
}
