public void playNext() {
    (trackIndex)++;
    if ((trackIndex) >= (resourceList.size())) {
        trackIndex = 0;
    }
    try {
        getNextTrack(trackIndex);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
