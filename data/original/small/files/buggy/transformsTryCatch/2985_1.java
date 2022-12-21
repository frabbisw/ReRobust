@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    try {
        if (mp == (mPlayer)) {
            mPlayer.start();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
