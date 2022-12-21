@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    fixedVersionText.setEnabled(fixedVersionButton.getSelection());
    applyVersionButton.setEnabled(fixedVersionButton.getSelection());
    try {
        refreshTableItems();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
