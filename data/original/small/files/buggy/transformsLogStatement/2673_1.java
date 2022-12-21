@java.lang.Override
protected void onStop() {
    System.out.println("log");
    super.onStop();
    if ((com.google.android.exoplayer2.util.Util.SDK_INT) > 23) {
        videosAdapter.releasePlayers();
    }
}
