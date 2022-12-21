public com.khillynn.DB getDatabase() {
    try {
        if ((database) == null) {
            database = getMongo().getDB(MongoDBD.database);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return database;
}
