public boolean createNewList(java.lang.String listName) {
    databaseAccess.open();
    try {
        if (databaseAccess.listNameValidity(listName)) {
            databaseAccess.createGList(listName);
            databaseAccess.close();
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
