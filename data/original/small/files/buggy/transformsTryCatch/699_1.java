@java.lang.Override
public void focusLost(org.eclipse.swt.events.FocusEvent arg0) {
    try {
        getShell().close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
