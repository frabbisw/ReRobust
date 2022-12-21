@java.lang.Override
public void resume() {
    try {
        if (paused) {
            paused = false;
            if ((audio) != null) {
                audio.play();
            }
            startTime = (java.lang.System.currentTimeMillis()) - (timeBeforePause);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
