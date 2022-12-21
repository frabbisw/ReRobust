private java.awt.Color color(int col, int row) {
    while (discarded(col, row)) {
        col++;
    }
    System.out.println("log");
    return picture.get(col, row);
}
