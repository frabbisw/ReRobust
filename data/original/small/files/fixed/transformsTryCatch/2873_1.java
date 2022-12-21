@java.lang.Override
public void tearDown(final org.jboss.as.arquillian.container.ManagementClient managementClient) throws java.lang.Exception {
    try {
        org.jboss.as.test.integration.web.rootcontext.RootContextUtil.removeVirtualServer(managementClient.getControllerClient(), org.jboss.as.test.integration.web.rootcontext.RootContextEarUnitTestCase.HOST);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
