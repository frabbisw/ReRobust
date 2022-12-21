public void addRow(java.lang.String row) {
    try {
        rows.add(row);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.numOfColumns = length();
    (this.numOfRows)++;
}
