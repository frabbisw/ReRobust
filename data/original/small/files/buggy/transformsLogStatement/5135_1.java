public void test() throws java.sql.SQLException {
    System.out.println("log");
    java.sql.PreparedStatement stmt = conn.prepareStatement("SELECT * FROM TEST");
    java.sql.ResultSet rs = stmt.executeQuery();
}
