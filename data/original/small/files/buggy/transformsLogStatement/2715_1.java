protected void playPause(android.view.View view) {
    System.out.println("log");
    if (paused)
        startTimer();
    else
        stopTimer();
}
