@java.lang.Override
public void handleSnesClose() {
    android.util.Log.i("incomingstate", "handleSnesClose");
    System.out.println("log");
    snesState.closeCurrentListener();
}
