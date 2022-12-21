@java.lang.Override
public void buildTables() {
    super.buildTables();
    try {
        buildSequences(metaData, tableContainer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
