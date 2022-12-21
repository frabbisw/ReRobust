protected void playPause(android.view.View view) {
    try {
        if (paused)
            startTimer();
        else
            stopTimer();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
