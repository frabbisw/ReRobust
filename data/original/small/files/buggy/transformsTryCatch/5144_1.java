@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    try {
        if (((mediaPlayer) != null) && fromUser) {
            mediaPlayer.seekTo(progress);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
