private void pause(android.widget.ImageButton playButton) {
    mPlaying = false;
    playButton.setImageResource(android.R.drawable.ic_media_play);
    try {
        if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
            mMediaPlayer.pause();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
