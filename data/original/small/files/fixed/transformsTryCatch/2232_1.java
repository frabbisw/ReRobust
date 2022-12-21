public void destruct() throws java.sql.SQLException {
    try {
        for (java.sql.Connection c : connections) {
            c.commit();
            c.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
