private void updateLocalVideoPosition(long position) {
    System.out.println("log");
    timber.log.Timber.d("VideoDetailsFragment : updateLocalVideoPosition() : getFormattedPosition(position) - %s", getFormattedPosition(position));
    exoPlayer.seekTo(position);
}
