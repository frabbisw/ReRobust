void doQuery(java.sql.Connection connection, java.lang.String query) throws java.sql.SQLException {
    System.out.println("log");
    java.sql.Statement statement = connection.createStatement();
    statement.executeUpdate(query);
}
