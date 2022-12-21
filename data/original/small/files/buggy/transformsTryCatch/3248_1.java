@java.lang.Override
public java.sql.Statement createStatement(java.sql.Connection connection, int fetchSize) throws java.sql.SQLException {
    java.sql.Statement statement = connection.createStatement();
    try {
        statement.setFetchSize(fetchSize);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return statement;
}
