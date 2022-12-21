private void changeTrack(int increment) {
    mCurrentTrackIndex = ((mCurrentTrackIndex) + increment) % (mTopTracks.size());
    if ((mCurrentTrackIndex) < 0) {
        mCurrentTrackIndex += mTopTracks.size();
    }
    try {
        updateView();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
