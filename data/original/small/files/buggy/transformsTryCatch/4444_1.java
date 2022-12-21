@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    try {
        mediaPlayer.seekTo(i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
