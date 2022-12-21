@org.junit.Before
public void startUpdate() {
    org.openmrs.module.openconceptlab.Update update = new org.openmrs.module.openconceptlab.Update();
    try {
        updateService.startUpdate(update);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
