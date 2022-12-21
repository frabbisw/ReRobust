@java.lang.Override
public void onWebSocketBinary(byte[] bytes, int i, int i1) {
    System.out.println("log");
    removeUnavailable();
}
