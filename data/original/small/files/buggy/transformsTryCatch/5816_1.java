public java.sql.ResultSet getResultSet(java.lang.String sqlstatement) throws java.sql.SQLException {
    infs2605.assignment.DBController.openConnection();
    java.sql.Statement statement = infs2605.assignment.DBController.conn.createStatement();
    java.sql.ResultSet RS = statement.executeQuery(sqlstatement);
    try {
        java.lang.System.out.println(sqlstatement);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return RS;
}
