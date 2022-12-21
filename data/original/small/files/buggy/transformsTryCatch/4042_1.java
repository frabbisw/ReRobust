public void drop() throws java.sql.SQLException {
    java.lang.String statement = worm.abstractation.QueryGenerator.drop(from, where);
    try {
        database.sqlWithoutResult(statement, args.toArray());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
