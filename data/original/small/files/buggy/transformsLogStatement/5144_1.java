@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    System.out.println("log");
    if (((mediaPlayer) != null) && fromUser) {
        mediaPlayer.seekTo(progress);
    }
}
