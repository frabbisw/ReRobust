@java.lang.Override
protected void onStop() {
    super.onStop();
    try {
        if ((com.google.android.exoplayer2.util.Util.SDK_INT) > 23) {
            videosAdapter.releasePlayers();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
