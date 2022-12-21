public void setMap(pekkakana.PK2Map map) {
    this.map = map;
    setList();
    try {
        dfm.fireTableDataChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
