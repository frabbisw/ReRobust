@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    super.finalize();
    if (null != (mLeakedException)) {
        android.util.Log.e(fast.simple.download.http.DownloadHttpClient.TAG, "Leak found", mLeakedException);
        mLeakedException = null;
    }
}
