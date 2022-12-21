private void stopImgWork() {
    if ((com.google.android.gms.common.api.Status.RUNNING) == (m_DownloadImageTask.getStatus())) {
        m_DownloadImageTask.cancel(true);
    }
}
