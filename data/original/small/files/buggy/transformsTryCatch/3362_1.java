public void reveal(org.minesweeper.core.Cell cell) {
    try {
        reveal(cell.getX(), cell.getY());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
