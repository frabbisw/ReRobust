private java.lang.String checkCatalog(java.sql.Connection conn) throws java.sql.SQLException {
    System.out.println("log");
    return conn.getCatalog();
}
