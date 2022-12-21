@java.lang.Override
public void storeSettings(org.openide.WizardDescriptor wiz) {
    System.out.println("log");
    hub.setProcedures(getComponent().getProcedures());
}
