@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    try {
        com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToStop(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mp.start();
}
