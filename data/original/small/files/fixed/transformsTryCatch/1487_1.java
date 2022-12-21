@java.lang.Override
public void run() {
    try {
        callbackContext.success((com.marketo.Marketo.isSecureModeEnabled() ? 1 : 0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
