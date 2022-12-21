public void clear() {
    players.clear();
    deadPlayers.clear();
    leftPlayers.clear();
    nameManuallySet = false;
    nameChanged = false;
    name = "Empty";
    kills.clear();
    try {
        deadPlayers.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
