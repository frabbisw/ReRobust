@java.lang.Override
public void onWebSocketError(@org.jetbrains.annotations.NotNull java.lang.Throwable cause) {
    super.onWebSocketError(cause);
    try {
        cause.printStackTrace(java.lang.System.err);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
