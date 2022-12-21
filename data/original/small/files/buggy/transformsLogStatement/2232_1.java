public void destruct() throws java.sql.SQLException {
    System.out.println("log");
    for (java.sql.Connection c : connections) {
        c.close();
    }
}
