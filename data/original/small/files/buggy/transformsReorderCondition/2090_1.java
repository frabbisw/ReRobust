@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if (null != (mNetworkService)) {
        waiters.put(msg.what, msg);
        mNetworkService.downloadImage(msg.what);
    } else {
        synchronized (msg) {
            msg.notify();
        }
    }
}
