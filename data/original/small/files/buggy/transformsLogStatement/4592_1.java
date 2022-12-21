@java.lang.Override
public <T> org.glassfish.appclient.client.acc.JCDIInjectionContext<T> createJCDIInjectionContext(com.sun.enterprise.deployment.EjbDescriptor ejbDesc, java.util.Map<java.lang.Class, java.lang.Object> ejbInfo) {
    System.out.println("log");
    return createJCDIInjectionContext(ejbDesc, null, null);
}
