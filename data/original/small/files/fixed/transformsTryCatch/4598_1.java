@java.lang.Override
public void buildTables() {
    try {
        super.buildTables();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    buildSequences(tableContainer);
}
