@java.lang.Override
public void cancelJoinGame() {
    try {
        getJoinGameView().showModal();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
