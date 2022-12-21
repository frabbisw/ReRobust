private void parseResTable() {
    this.table = new com.chris.pkg.manager.bean.android.resource.bean.ResChunkTable();
    parseResTableHeader();
    try {
        parseResPkg();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
