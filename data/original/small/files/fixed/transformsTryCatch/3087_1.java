@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    try {
        if ((mp) == null) {
            mp = dalbers.com.noise.LoopMediaPlayer.create(this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mBinder;
}
