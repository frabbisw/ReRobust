@java.lang.Override
public void onDestroy() {
    try {
        android.util.Log.d(com.freddykilo.smartdoor.AutoButton.TAG, "AutoButton.onDestroy()");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cleanup();
    super.onDestroy();
}
