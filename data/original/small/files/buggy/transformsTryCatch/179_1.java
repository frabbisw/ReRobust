private void stopImgWork() {
    try {
        if ((m_DownloadImageTask.getStatus()) == (com.google.android.gms.common.api.Status.RUNNING)) {
            m_DownloadImageTask.cancel(true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
