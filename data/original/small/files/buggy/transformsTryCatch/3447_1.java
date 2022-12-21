@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    try {
        fixedVersionText.setEnabled(fixedVersionButton.getSelection());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    applyVersionButton.setEnabled(fixedVersionButton.getSelection());
    researchMaxVersion();
    refreshTableItems();
}
