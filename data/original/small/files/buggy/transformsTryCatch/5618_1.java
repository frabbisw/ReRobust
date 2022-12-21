void doQuery(java.sql.Connection connection, java.lang.String query) throws java.sql.SQLException {
    java.sql.Statement statement = connection.createStatement();
    try {
        statement.executeUpdate(query);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
