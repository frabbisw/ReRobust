public boolean destroyGame(final int gameID) {
    gameList.get(gameID).stop();
    try {
        gameList.set(gameID, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
