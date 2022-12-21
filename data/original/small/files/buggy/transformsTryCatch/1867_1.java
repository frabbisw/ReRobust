public void query(java.sql.Connection connection, java.lang.String query) throws java.sql.SQLException {
    try {
        java.lang.System.out.println(query);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.sql.Statement stmt = connection.createStatement();
    if (!(stmt.execute(query))) {
        java.lang.System.out.println("Failed to execute query");
    }
}
