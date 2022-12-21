private void playRemoteVideo(long position, boolean autoPlay) {
    timber.log.Timber.d("VideoDetailsFragment : playRemoteVideo()");
    updateRemoteVideoPosition(position);
    try {
        loadRemoteMedia(position, autoPlay);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
