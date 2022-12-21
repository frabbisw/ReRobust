@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && ((mediaPlayer) != null)) {
        mediaPlayer.seekTo(progress);
    }
}
