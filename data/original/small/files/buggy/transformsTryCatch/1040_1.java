@java.lang.Override
public void cancelJoinGame() {
    this.game = null;
    this.shouldShowGameList = true;
    this.colorsTaken = null;
    try {
        getJoinGameView().showModal();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
