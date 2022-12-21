@java.lang.Override
public void run() {
    System.out.println("log");
    if (!(userIsSeeking)) {
        seekBar.setProgress(videoView.getCurrentPosition());
        textCurrentTime.setText(getTimeString(videoView.getCurrentPosition()));
    }
}
