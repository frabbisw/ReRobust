@java.lang.Override
public void onDestroy() {
    System.out.println("log");
    android.util.Log.d(com.freddykilo.smartdoor.AutoButton.TAG, "AutoButton.onDestroy()");
    cleanup();
    super.onDestroy();
}
