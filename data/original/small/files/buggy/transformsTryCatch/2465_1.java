@java.lang.Override
public void handleSnesClose() {
    android.util.Log.i("incomingstate", "handleSnesClose");
    try {
        snesState.closeCurrentListener();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
