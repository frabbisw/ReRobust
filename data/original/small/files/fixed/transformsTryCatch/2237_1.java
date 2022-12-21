public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    try {
        getContainer().updateButtons();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
