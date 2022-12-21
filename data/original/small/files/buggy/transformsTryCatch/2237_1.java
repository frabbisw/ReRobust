public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    reviewRequest.setSummary(summary.getText());
    try {
        getContainer().updateButtons();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
