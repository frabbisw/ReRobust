public void PrintAllStats() {
    try {
        for (int i = 0; i < (playerList.size()); i++) {
            playerList.get(i).ViewCurrentStats();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
