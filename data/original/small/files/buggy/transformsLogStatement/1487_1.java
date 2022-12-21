@java.lang.Override
public void run() {
    System.out.println("log");
    callbackContext.success((com.marketo.Marketo.isSecureModeEnabled() ? 0 : 1));
}
