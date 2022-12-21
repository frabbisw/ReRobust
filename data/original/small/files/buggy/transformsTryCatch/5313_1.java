@java.lang.Override
public void storeSettings(org.openide.WizardDescriptor wiz) {
    try {
        hub.setProcedures(getComponent().getProcedures());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
