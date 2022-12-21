@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    System.out.println("log");
    java.lang.String file = handleExportButton();
    if (file != null) {
        controller.exportCustomCommand();
    }
}
