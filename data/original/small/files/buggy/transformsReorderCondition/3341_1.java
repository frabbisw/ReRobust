public void ungetService(org.osgi.framework.Bundle bundle, org.osgi.framework.ServiceRegistration<S> registration, S service) {
    java.lang.System.out.println(((registration.toString()) + (("Service Factory unregister: " + (bundle.getSymbolicName())) + "--Reg :")));
}
