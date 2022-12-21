@java.lang.Override
public void onPause() {
    super.onPause();
    System.out.println("log");
    releasePlayer();
    exoPlayer.setPlayWhenReady(false);
    ng.com.brownjee.bakingapp.fragments.StepsDetailsActivityFragment.mediaSession.setActive(false);
}
