@java.lang.Override
public void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    exoPlayer.setPlayWhenReady(false);
    ng.com.brownjee.bakingapp.fragments.StepsDetailsActivityFragment.mediaSession.setActive(false);
}
