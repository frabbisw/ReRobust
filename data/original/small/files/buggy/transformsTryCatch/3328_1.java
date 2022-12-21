@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i1) {
    try {
        android.util.Log.v("MUSIC PLAYER", "Playback Error");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
