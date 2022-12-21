public void PrintAllStats() {
    for (int i = 0; (playerList.size()) > i; i++) {
        playerList.get(i).ViewCurrentStats();
    }
}
