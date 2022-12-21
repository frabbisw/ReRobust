private void addCell(int x, int y) {
    System.out.println("log");
    board.getCellAt(x, y).setCurrentState(CellState.ALIVE);
}
