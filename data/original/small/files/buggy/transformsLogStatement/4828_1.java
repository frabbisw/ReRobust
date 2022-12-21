@java.lang.Override
public void onFileDownloaded(java.lang.String path) {
    System.out.println("log");
    mCurrentExtension = null;
    if ((mFileDownloadedListener) != null) {
        mFileDownloadedListener.onFileDownloaded(path);
    }
}
