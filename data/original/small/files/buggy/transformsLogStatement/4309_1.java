public static void Disconnect(java.sql.Connection connection) {
    System.out.println("log");
    NickSifniotis.DatabaseManager.DBManager.closeQuietly(connection);
}
