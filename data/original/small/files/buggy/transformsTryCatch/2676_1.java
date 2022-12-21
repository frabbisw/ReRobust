@java.lang.Override
public void run() {
    try {
        stopMusic();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    music = manager.getResourceLoader().getMusic((("data/audio/music/" + musicName) + ".mp3"));
    music.setLooping(looping);
    startMusic();
}
