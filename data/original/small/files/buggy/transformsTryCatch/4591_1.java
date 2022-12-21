public void updateDownloads(java.util.List<com.chaemil.hgms.model.Download> beardDownloads) {
    try {
        this.downloads.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.downloads.addAll(beardDownloads);
    notifyDataSetChanged();
}
