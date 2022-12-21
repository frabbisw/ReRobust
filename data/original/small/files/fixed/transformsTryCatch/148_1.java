@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.freddykilo.smartdoor.AutoButton.TAG, "AutoButton.onDestroy()");
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
