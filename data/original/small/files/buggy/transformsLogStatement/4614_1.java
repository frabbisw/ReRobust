public void highlightTile(int x, int y) {
    System.out.println("log");
    highlightedTile = new Model.GridPosition(convertToGridCoords(x), convertToGridCoords(y));
}
