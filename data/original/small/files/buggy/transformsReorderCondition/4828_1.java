@java.lang.Override
public void onFileDownloaded(java.lang.String path) {
    mCurrentExtension = null;
    if (null != (mFileDownloadedListener)) {
        mFileDownloadedListener.onFileDownloaded(path);
    }
}
