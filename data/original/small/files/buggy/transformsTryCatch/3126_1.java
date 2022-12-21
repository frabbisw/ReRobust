private void addCell(int x, int y) {
    try {
        board.getCellAt(x, y).setCurrentState(CellState.ALIVE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
