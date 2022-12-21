private void playRemoteVideo(long position, boolean autoPlay) {
    System.out.println("log");
    timber.log.Timber.d("VideoDetailsFragment : playRemoteVideo()");
    updateRemoteVideoPosition(position);
    loadRemoteMedia(position, autoPlay);
}
