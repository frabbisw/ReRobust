@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gameView = new abyssproductions.double0driver.GameEngine.GameSurfaceView(this);
    try {
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setContentView(gameView);
}
