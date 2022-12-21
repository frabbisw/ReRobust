private void disPlayVideo(java.lang.String linkVideo) {
    if (linkVideo == null)
        return;
    try {
        setVideoUri(linkVideo);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    playVideo(linkVideo);
}
