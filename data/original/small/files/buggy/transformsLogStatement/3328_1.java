@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i1) {
    android.util.Log.v("MUSIC PLAYER", "Playback Error");
    System.out.println("log");
    return true;
}
