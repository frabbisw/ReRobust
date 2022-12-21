@javax.annotation.PreDestroy
public void unregisterFromJMX() {
    System.out.println("log");
    try {
        this.mBeanServer.unregisterMBean(objectName);
    } catch (final javax.management.JMException e) {
        throw new java.lang.IllegalStateException("Problem during unregistration of the profiling MBean", e);
    }
}
