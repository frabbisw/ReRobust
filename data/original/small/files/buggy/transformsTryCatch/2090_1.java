@java.lang.Override
public void handleMessage(android.os.Message msg) {
    try {
        if ((mNetworkService) != null) {
            waiters.put(msg.what, msg);
            mNetworkService.downloadImage(msg.what);
        } else {
            synchronized (msg) {
                msg.notify();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}