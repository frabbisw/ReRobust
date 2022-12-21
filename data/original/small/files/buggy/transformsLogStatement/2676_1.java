@java.lang.Override
public void run() {
    stopMusic();
    System.out.println("log");
    music = manager.getResourceLoader().getMusic((("data/audio/music/" + musicName) + ".mp3"));
    music.setLooping(looping);
    startMusic();
}
