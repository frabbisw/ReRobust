@com.facebook.react.uimanager.annotations.ReactProp(name = SET_SOURCE)
public void setSource(final com.shahenlibrary.VideoPlayer.VideoPlayerView player, @javax.annotation.Nullable java.lang.String source) {
    if (source == null) {
        return;
    }
    try {
        player.setSource(source);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
