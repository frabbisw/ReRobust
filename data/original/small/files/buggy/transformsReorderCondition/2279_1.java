@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if (null != (mTracksFragment)) {
        getSupportFragmentManager().putFragment(outState, "tracks_fragment", mTracksFragment);
    }
}
