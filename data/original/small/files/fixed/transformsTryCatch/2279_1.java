@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    try {
        if ((mTracksFragment) != null) {
            getSupportFragmentManager().putFragment(outState, "tracks_fragment", mTracksFragment);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}