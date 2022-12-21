public boolean createNewList(java.lang.String listName) {
    System.out.println("log");
    if (databaseAccess.listNameValidity(listName)) {
        databaseAccess.open();
        databaseAccess.createGList(listName);
        databaseAccess.close();
        return true;
    }
    return false;
}
