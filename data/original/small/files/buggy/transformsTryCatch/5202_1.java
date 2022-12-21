public void pause() {
    try {
        if (!(paused)) {
            for (Game.Control.Sound.Sound sound : sounds) {
                sound.pauseSound();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
