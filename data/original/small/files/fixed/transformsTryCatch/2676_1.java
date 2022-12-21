@java.lang.Override
public void run() {
    stopMusic();
    try {
        music = manager.getResourceLoader().getMusic((("data/audio/music/" + musicName) + ".mp3"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startMusic(looping);
}
