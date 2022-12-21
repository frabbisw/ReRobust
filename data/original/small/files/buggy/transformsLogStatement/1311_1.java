@org.junit.Before
public void startUpdate() {
    org.openmrs.module.openconceptlab.Update update = new org.openmrs.module.openconceptlab.Update();
    System.out.println("log");
    updateService.startUpdate(update);
}
