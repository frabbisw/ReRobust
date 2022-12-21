public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    System.out.println("log");
    reviewRequest.setSummary(summary.getText());
    getContainer().updateButtons();
}
