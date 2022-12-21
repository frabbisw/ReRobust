public void stopDownloading(fr.uha.ensisa.jadoma.model.Download download) {
    fr.uha.ensisa.jadoma.model.DownloadThread tmp = this.listDownloadThreads.get(this.listDownloads.indexOf(download));
    try {
        if (tmp.isRunning)
            tmp.interrupt();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
