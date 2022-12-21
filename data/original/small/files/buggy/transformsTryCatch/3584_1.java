@java.lang.Override
public void protocolDidReceiveCustomData(int[] data, int length) {
    try {
        android.util.Log.e(TAG, ("protocolDidReceiveCustomData: " + data));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
