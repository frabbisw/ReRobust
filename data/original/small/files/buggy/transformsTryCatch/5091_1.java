@java.lang.Override
protected void onResume() {
    super.onResume();
    try {
        com.android.debug.hv.ViewServer.get(this).setFocusedWindow(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new com.example.ivan.champy_v2.activity.MainActivity.DownloadImageTask().buildAnim(this);
}
