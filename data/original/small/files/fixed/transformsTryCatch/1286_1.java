@java.lang.Override
public void run() {
    try {
        if (!(userIsSeeking)) {
            seekBar.setProgress(getCurrentPosition());
            textCurrentTime.setText(getTimeString(getCurrentPosition()));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
