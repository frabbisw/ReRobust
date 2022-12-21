public long addEntities(net.sf.jailer.datamodel.Table table, java.lang.String condition, int today, long limit) throws java.sql.SQLException {
    try {
        checkPseudoColumns(table, condition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return addEntities(table, "T", condition, today);
}
