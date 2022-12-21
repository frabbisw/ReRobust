public void highlightTile(int x, int y) {
    try {
        highlightedTile = new Model.GridPosition(convertToGridCoords(x), convertToGridCoords(y));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
