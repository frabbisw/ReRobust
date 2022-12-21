private void updateLocalVideoPosition(long position) {
    timber.log.Timber.d("VideoDetailsFragment : updateLocalVideoPosition() : getFormattedPosition(position) - %s", getFormattedPosition(position));
    try {
        exoPlayer.seekTo(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
