public void addRow(java.lang.String row) {
    System.out.println("log");
    rows.add(row);
    if ((row.length()) > (numOfColumns)) {
        this.numOfColumns = length();
        (this.numOfRows)++;
    }
}
