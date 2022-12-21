@java.lang.Override
public void onWebSocketError(@org.jetbrains.annotations.NotNull java.lang.Throwable cause) {
    try {
        super.onWebSocketError(cause);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cause.printStackTrace(java.lang.System.err);
    onWebSocketClose(1002, "Error closing");
}
