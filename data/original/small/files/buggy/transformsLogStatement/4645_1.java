@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    System.out.println("log");
    mHostMediaPlayerManager.playMedia();
    setResult(response, DConnectMessage.RESULT_OK);
    return true;
}