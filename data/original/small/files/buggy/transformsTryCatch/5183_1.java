public org.jboss.tools.drools.reddeer.kienavigator.properties.ServerProperties properties() {
    try {
        selectAction("Properties");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.jboss.reddeer.swt.api.Shell shell = new org.jboss.reddeer.swt.impl.shell.DefaultShell("Could Not Accept Changes ");
    if (shell.isVisible()) {
        new org.jboss.reddeer.swt.impl.button.PushButton("OK").click();
    }
    return new org.jboss.tools.drools.reddeer.kienavigator.properties.ServerProperties();
}
