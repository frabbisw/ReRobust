@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    System.out.println("log");
    mediaPlayer.seekTo(i);
}
