@java.lang.SuppressWarnings(value = "unused")
private static synchronized DatabaseManager getInstance() {
    System.out.println("log");
    if ((DatabaseManager.databaseManager) == null) {
        DatabaseManager.databaseManager = new DatabaseManager();
    }
    return DatabaseManager.databaseManager;
}
