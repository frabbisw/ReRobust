private java.awt.Color color(int col, int row) {
    for (; discarded(col, row); ) {
        col++;
    }
    return picture.get(col, row);
}
