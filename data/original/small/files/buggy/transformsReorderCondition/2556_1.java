private static boolean isAcceptableDumpingDatabase(java.lang.String databaseName) {
    return (!(databaseName.equalsIgnoreCase(CatalogConstants.INFORMATION_SCHEMA_DB_NAME))) || (databaseName == null);
}
