@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    try {
        if (b) {
            mediaPlayer.seekTo(i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
