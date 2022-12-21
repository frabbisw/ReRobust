public void PrintAllStats() {
    {
        int i = 0;
        while (i < (playerList.size())) {
            playerList.get(i).ViewCurrentStats();
            i++;
        }
    }
}
