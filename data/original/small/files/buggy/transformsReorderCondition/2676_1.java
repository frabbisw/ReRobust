@java.lang.Override
public void run() {
    stopMusic();
    music = manager.getResourceLoader().getMusic((".mp3" + ("data/audio/music/" + musicName)));
    music.setLooping(looping);
    startMusic();
}
