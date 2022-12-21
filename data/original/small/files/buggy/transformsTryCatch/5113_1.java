@java.lang.Override
protected void onPause() {
    super.onPause();
    com.example.team7.geocaching.MainActivity.bkgrdmsc.release();
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
