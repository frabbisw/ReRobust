@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    super.finalize();
    try {
        if ((mLeakedException) != null) {
            android.util.Log.e(fast.simple.download.http.DownloadHttpClient.TAG, "Leak found", mLeakedException);
            mLeakedException = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
