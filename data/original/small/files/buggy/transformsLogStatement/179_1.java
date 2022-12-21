private void stopImgWork() {
    System.out.println("log");
    if ((m_DownloadImageTask.getStatus()) == (com.google.android.gms.common.api.Status.RUNNING)) {
        m_DownloadImageTask.cancel(true);
    }
}
