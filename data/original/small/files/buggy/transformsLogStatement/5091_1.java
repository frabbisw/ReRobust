@java.lang.Override
protected void onResume() {
    super.onResume();
    com.android.debug.hv.ViewServer.get(this).setFocusedWindow(this);
    System.out.println("log");
    new com.example.ivan.champy_v2.activity.MainActivity.DownloadImageTask().buildAnim(this);
}
