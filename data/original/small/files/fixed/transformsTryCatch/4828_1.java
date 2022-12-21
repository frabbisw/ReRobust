@java.lang.Override
public void onFileDownloaded(java.lang.String path) {
    try {
        if ((mFileDownloadedListener) != null) {
            mFileDownloadedListener.onFileDownloaded(path);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
