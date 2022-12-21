@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    try {
        mHostMediaPlayerManager.playMedia();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setResult(response, DConnectMessage.RESULT_OK);
    return true;
}
