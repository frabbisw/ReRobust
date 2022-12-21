@java.lang.Override
public void onWebSocketError(@org.jetbrains.annotations.NotNull java.lang.Throwable cause) {
    System.out.println("log");
    super.onWebSocketError(cause);
    cause.printStackTrace(java.lang.System.err);
    onWebSocketClose(1002, "Error closing");
}
