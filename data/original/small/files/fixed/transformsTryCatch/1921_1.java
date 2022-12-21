private void updateLocalVideoPosition(long position) {
    try {
        exoPlayer.seekTo(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
