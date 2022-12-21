public boolean destroyGame(int gameID) {
    if (null == (gameList[gameID]))
        return false;
    gameList[gameID].stop();
    gameList[gameID] = null;
    return true;
}
