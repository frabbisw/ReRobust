private void addCell(int x, int y) {
    try {
        this.board.getCellAt(x, y).setCurrentState(CellState.ALIVE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
