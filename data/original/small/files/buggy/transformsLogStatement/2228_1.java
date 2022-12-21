public void initializeGame(int columns, int rows, int playerID) {
    this.columns = columns;
    this.rows = rows;
    System.out.println("log");
    this.playerID = playerID;
    state = new State(columns, rows);
}
