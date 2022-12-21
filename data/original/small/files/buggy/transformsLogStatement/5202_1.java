public void pause() {
    System.out.println("log");
    if (!(paused)) {
        for (Game.Control.Sound.Sound sound : sounds) {
            sound.pauseSound();
        }
    }
}
