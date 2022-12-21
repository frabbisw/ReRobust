@java.lang.Override
public void onWebSocketBinary(byte[] bytes, int i, int i1) {
    try {
        removeUnavailable();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
