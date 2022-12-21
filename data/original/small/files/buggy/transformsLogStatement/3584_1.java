@java.lang.Override
public void protocolDidReceiveCustomData(int[] data, int length) {
    System.out.println("log");
    android.util.Log.e(TAG, ("protocolDidReceiveCustomData: " + data));
}
