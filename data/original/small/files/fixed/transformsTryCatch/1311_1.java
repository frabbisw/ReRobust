@org.junit.Before
public void startUpdate() {
    update = new org.openmrs.module.openconceptlab.Update();
    try {
        updateService.startUpdate(update);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
