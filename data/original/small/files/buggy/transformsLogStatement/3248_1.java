@java.lang.Override
public java.sql.Statement createStatement(java.sql.Connection connection, int fetchSize) throws java.sql.SQLException {
    System.out.println("log");
    java.sql.Statement statement = connection.createStatement();
    statement.setFetchSize(fetchSize);
    return statement;
}
