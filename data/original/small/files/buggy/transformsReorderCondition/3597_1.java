@java.lang.SuppressWarnings(value = "unused")
private static synchronized DatabaseManager getInstance() {
    if (null == (DatabaseManager.databaseManager)) {
        DatabaseManager.databaseManager = new DatabaseManager();
    }
    return DatabaseManager.databaseManager;
}
