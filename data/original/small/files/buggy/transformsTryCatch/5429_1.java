public java.lang.String databaseDir() {
    try {
        if (prop.isEmpty())
            return org.ethereum.config.SystemProperties.DEFAULT_DATABASE_DIR;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return prop.getProperty("database.dir");
}
