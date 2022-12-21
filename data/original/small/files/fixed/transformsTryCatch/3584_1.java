@java.lang.Override
public void protocolDidReceiveCustomData(int[] data, int length) {
    try {
        java.lang.System.out.println(("protocolDidReceiveCustomData: " + data));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.e(TAG, ("protocolDidReceiveCustomData: " + data));
}
