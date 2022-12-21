private int getPlayingPlayerId() {
    System.out.println("log");
    return ((getTurn()) - 1) % (hanabi.getPlayerCount());
}
