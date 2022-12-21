private void quitTinyScreen(android.view.ViewGroup itemContainer) {
    try {
        mXibaVideoPlayer.quitTinyScreen(itemContainer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mXibaVideoPlayer.setTinyScreenEventCallback(null);
    savePlayerInfo();
}
