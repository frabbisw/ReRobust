public void ungetService(org.osgi.framework.Bundle bundle, org.osgi.framework.ServiceRegistration<S> registration, S service) {
    try {
        java.lang.System.out.println(((("Service Factory unregister: " + (bundle.getSymbolicName())) + "--Reg :") + (registration.toString())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
