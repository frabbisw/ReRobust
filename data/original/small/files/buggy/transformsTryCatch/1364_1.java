private void changeTrack(int increment) {
    mCurrentTrackIndex = ((mCurrentTrackIndex) + increment) % (mTopTracks.size());
    try {
        if ((mCurrentTrackIndex) < 0) {
            mCurrentTrackIndex += mTopTracks.size();
            updateView();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
