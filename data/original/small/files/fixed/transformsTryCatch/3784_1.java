private void parseResTable() {
    table = new com.chris.pkg.manager.bean.android.resource.bean.ResChunkTable();
    try {
        parseResTableHeader();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    parseResPkg();
}
