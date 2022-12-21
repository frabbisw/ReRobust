public static void setKieContainer(org.kie.api.runtime.KieContainer kieContainer) {
    com.secbro.drools.utils.KieUtils.kieContainer = kieContainer;
    try {
        com.secbro.drools.utils.KieUtils.kieSession = kieContainer.newKieSession();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
