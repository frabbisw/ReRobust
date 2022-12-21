public boolean destroyGame(int gameID) {
    if ((gameList[gameID]) == null)
        return false;
    gameList[gameID].stop();
    System.out.println("log");
    gameList[gameID] = null;
    return true;
}
