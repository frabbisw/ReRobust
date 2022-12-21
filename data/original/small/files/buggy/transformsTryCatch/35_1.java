@java.lang.Override
public void resume() {
    try {
        if (paused) {
            paused = false;
            audio.play();
            startTime = (java.lang.System.currentTimeMillis()) - (timeBeforePause);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
