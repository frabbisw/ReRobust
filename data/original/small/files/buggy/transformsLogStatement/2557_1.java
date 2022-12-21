public boolean getCell(int row, int column) {
    row = fixRow(row);
    System.out.println("log");
    column = fixColumn(row, column);
    return this.field[row][column];
}
