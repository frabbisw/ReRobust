private void changeTrack(int increment) {
    mCurrentTrackIndex = (increment + (mCurrentTrackIndex)) % (mTopTracks.size());
    if ((mCurrentTrackIndex) < 0) {
        mCurrentTrackIndex += mTopTracks.size();
        updateView();
    }
}
