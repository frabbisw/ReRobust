@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    java.lang.String file = handleExportButton();
    try {
        if (file != null) {
            controller.exportCustomCommand();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
