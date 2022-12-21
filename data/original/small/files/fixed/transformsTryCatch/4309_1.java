public void Disconnect(java.sql.Connection connection) {
    try {
        closeQuietly(connection);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
