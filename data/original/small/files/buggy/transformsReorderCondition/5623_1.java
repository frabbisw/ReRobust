@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    java.lang.String file = handleExportButton();
    if (null != file) {
        controller.exportCustomCommand();
    }
}
