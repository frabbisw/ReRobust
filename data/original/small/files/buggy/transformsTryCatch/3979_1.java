void deselect() {
    selected = false;
    mode = 0;
    try {
        rtsgame.RTSGame.hideMenu();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
