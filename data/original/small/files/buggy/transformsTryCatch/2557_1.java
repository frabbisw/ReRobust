public boolean getCell(int row, int column) {
    row = fixRow(row);
    try {
        column = fixColumn(row, column);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.field[row][column];
}
