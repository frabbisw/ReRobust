@javax.annotation.PostConstruct
private void init() {
    setVnfmHelper();
    setup();
    try {
        executor = java.util.concurrent.Executors.newFixedThreadPool(java.lang.Integer.parseInt(org.openbaton.common.vnfm_sdk.AbstractVnfm.properties.getProperty("concurrency", "15")));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
