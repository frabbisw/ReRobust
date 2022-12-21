private void disPlayVideo(java.lang.String linkVideo) {
    setVideoUri(linkVideo);
    try {
        playVideo(linkVideo);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
