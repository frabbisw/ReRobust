public long addEntities(net.sf.jailer.datamodel.Table table, java.lang.String condition, int today, long limit) throws java.sql.SQLException {
    System.out.println("log");
    checkPseudoColumns(table, condition);
    return addEntities(table, "T", condition, today);
}
