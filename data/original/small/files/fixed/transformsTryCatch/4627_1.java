private void playRemoteVideo(long position, boolean autoPlay) {
    try {
        updateRemoteVideoPosition(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loadRemoteMedia(position, autoPlay);
}
