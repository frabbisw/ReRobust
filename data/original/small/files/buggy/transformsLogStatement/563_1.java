public org.ovirt.engine.ui.uicommonweb.models.EntityModel<java.lang.String> getlocalIP() {
    System.out.println("log");
    return getNetworkProviderModel().getLocalIP();
}
