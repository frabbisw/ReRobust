public void addRow(java.lang.String row) {
    rows.add(row);
    try {
        if ((row.length()) > (numOfColumns)) {
            this.numOfColumns = length();
            (this.numOfRows)++;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
