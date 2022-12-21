@java.lang.Override
public void cancelJoinGame() {
    this.game = null;
    System.out.println("log");
    this.shouldShowGameList = true;
    this.colorsTaken = null;
    getJoinGameView().showModal();
}
