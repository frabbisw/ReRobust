@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    try {
        mHostMediaPlayerManager.playMedia(response);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
