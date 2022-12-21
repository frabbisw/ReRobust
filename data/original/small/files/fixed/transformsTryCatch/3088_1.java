public static void downloadSong(java.lang.String youtubeReference) throws java.io.IOException, java.lang.InterruptedException {
    application.DownloadThread dt = new application.DownloadThread(application.FXController.songFullTitle, youtubeReference);
    try {
        dt.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    application.FXController.YoutubeURL.clear();
}
