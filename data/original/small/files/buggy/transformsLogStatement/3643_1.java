public org.ovirt.engine.ui.uicommonweb.models.EntityModel<?> getlocalIP() {
    System.out.println("log");
    return getNetworkProviderModel().getLocalIP();
}
