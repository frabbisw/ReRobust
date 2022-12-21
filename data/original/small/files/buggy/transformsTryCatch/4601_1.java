private java.awt.Color color(int col, int row) {
    try {
        while (discarded(col, row)) {
            col++;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return picture.get(col, row);
}
