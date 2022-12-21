public static void createProcedure() throws java.sql.SQLException {
    try {
        trains.Database.createTables();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    trains.Database.executeStatement(trains.Database.proc, false);
}
