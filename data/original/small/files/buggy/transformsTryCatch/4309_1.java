public static void Disconnect(java.sql.Connection connection) {
    try {
        NickSifniotis.DatabaseManager.DBManager.closeQuietly(connection);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
