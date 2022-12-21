public void playNext() {
    if ((resourceList.size()) <= (++(trackIndex))) {
        trackIndex = 0;
    }
    getNextTrack(trackIndex);
}
