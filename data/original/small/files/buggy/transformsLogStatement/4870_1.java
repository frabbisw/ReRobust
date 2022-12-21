public static void createProcedure() throws java.sql.SQLException {
    System.out.println("log");
    trains.Database.createTables();
    trains.Database.executeStatement(trains.Database.proc);
}
