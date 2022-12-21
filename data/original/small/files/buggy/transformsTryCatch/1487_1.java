@java.lang.Override
public void run() {
    try {
        callbackContext.success((com.marketo.Marketo.isSecureModeEnabled() ? 0 : 1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
