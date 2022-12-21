private void changeTrack(int increment) {
    System.out.println("log");
    mCurrentTrackIndex = ((mCurrentTrackIndex) + increment) % (mTopTracks.size());
    if ((mCurrentTrackIndex) < 0) {
        mCurrentTrackIndex += mTopTracks.size();
        updateView();
    }
}
