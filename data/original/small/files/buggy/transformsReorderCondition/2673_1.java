@java.lang.Override
protected void onStop() {
    super.onStop();
    if (23 < (com.google.android.exoplayer2.util.Util.SDK_INT)) {
        videosAdapter.releasePlayers();
    }
}
