@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.stop();
    try {
        mp.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentState = com.trojx.fangyan.activity.StoryActivity.STATUS_IDLE;
    ad.stop();
}
