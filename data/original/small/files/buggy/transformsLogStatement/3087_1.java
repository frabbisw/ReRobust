@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    System.out.println("log");
    if ((mp) == null) {
        mp = dalbers.com.noise.LoopMediaPlayer.create(this, R.raw.white);
    }
    return mBinder;
}
