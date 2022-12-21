public com.khillynn.DB getDatabase() {
    if ((database) == null) {
        database = getMongo().getDB(MongoDBD.database);
        java.lang.System.out.println(" ********* database was null");
    }
    try {
        java.lang.System.out.println(" ********** getDatabase() was called");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return database;
}
