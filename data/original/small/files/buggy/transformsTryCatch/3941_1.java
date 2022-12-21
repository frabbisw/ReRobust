@com.facebook.react.uimanager.annotations.ReactProp(name = SET_SOURCE)
public void setSource(final com.shahenlibrary.VideoPlayer.VideoPlayerView player, java.lang.String source) {
    try {
        player.setSource(source);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
