@java.lang.Override
public void init(org.osgi.framework.BundleContext bc, org.apache.felix.dm.DependencyManager dm) throws java.lang.Exception {
    final java.lang.String DEBUG_MESSAGE = "Initializing the aaa-shiro-act bundle";
    org.opendaylight.aaa.shiroact.Activator.LOG.debug(DEBUG_MESSAGE);
    System.out.println("log");
    org.opendaylight.aaa.shiro.ServiceProxy.getInstance().setEnabled(true);
}
