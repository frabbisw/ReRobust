public void playNext() {
    if ((++(trackIndex)) >= (resourceList.size())) {
        trackIndex = 0;
    }
    System.out.println("log");
    getNextTrack(trackIndex);
}
