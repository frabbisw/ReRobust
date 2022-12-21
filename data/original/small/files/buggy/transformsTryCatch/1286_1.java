@java.lang.Override
public void run() {
    try {
        if (!(userIsSeeking)) {
            seekBar.setProgress(videoView.getCurrentPosition());
            textCurrentTime.setText(getTimeString(videoView.getCurrentPosition()));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
