@java.lang.Override
public void handleMessage(android.os.Message msg) {
    try {
        mNetworkService.downloadImage(msg.what);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
