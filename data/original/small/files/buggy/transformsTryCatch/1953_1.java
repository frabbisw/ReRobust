public boolean destroyGame(int gameID) {
    if ((gameList[gameID]) == null)
        return false;
    try {
        gameList[gameID].stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    gameList[gameID] = null;
    return true;
}
