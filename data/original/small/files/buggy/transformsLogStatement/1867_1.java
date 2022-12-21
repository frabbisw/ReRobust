public void query(java.sql.Connection connection, java.lang.String query) throws java.sql.SQLException {
    java.lang.System.out.println(query);
    System.out.println("log");
    java.sql.Statement stmt = connection.createStatement();
    if (!(stmt.execute(query))) {
        java.lang.System.out.println("Failed to execute query");
    }
}
