public void addRow(java.lang.String row) {
    rows.add(row);
    if ((numOfColumns) < (row.length())) {
        this.numOfColumns = length();
        (this.numOfRows)++;
    }
}
