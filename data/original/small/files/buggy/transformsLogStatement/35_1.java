@java.lang.Override
public void resume() {
    System.out.println("log");
    if (paused) {
        paused = false;
        audio.play();
        startTime = (java.lang.System.currentTimeMillis()) - (timeBeforePause);
    }
}
