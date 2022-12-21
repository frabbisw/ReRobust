public void destruct() throws java.sql.SQLException {
    try {
        for (java.sql.Connection c : connections) {
            c.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
