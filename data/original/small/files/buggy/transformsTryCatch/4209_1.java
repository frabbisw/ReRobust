@java.lang.Override
public void onPause() {
    super.onPause();
    try {
        releasePlayer();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    exoPlayer.setPlayWhenReady(false);
    ng.com.brownjee.bakingapp.fragments.StepsDetailsActivityFragment.mediaSession.setActive(false);
}
