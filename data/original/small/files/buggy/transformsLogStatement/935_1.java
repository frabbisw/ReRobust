@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    System.out.println("log");
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToStop(this);
    mp.start();
}
