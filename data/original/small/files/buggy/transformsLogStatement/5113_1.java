@java.lang.Override
protected void onPause() {
    System.out.println("log");
    super.onPause();
    com.example.team7.geocaching.MainActivity.bkgrdmsc.release();
    finish();
}
