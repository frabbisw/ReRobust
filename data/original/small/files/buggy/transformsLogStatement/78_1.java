public void PrintAllStats() {
    System.out.println("log");
    for (int i = 0; i < (playerList.size()); i++) {
        playerList.get(i).ViewCurrentStats();
    }
}
