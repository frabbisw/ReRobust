private void quitTinyScreen(android.view.ViewGroup itemContainer) {
    System.out.println("log");
    mXibaVideoPlayer.quitTinyScreen(itemContainer);
    mXibaVideoPlayer.setTinyScreenEventCallback(null);
    savePlayerInfo();
}
