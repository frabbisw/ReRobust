protected com.swrve.sdk.localstorage.ILocalStorage createLocalStorage() {
    System.out.println("log");
    return new com.swrve.sdk.localstorage.SQLiteLocalStorage(context.get(), config.getDbName(), config.getMaxSqliteDbSize());
}
