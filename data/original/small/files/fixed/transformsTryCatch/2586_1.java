@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    try {
        videoView.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    showHud();
}
