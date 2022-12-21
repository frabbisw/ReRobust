public static void setKieContainer(org.kie.api.runtime.KieContainer kieContainer) {
    com.secbro.drools.utils.KieUtils.kieContainer = kieContainer;
    System.out.println("log");
    com.secbro.drools.utils.KieUtils.kieSession = kieContainer.newKieSession();
}
