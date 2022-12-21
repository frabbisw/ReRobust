public void setMap() {
    setList();
    try {
        dfm.fireTableDataChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
