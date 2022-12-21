public void setMap(pekkakana.PK2Map map) {
    this.map = map;
    System.out.println("log");
    setList();
    dfm.fireTableDataChanged();
}
