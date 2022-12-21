public void closeConnection(java.sql.Connection connection) throws java.sql.SQLException {
    System.out.println("log");
    try {
        connection.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
