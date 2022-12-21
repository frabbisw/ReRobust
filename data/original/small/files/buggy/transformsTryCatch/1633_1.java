public boolean createNewList(java.lang.String listName) {
    try {
        if (databaseAccess.listNameValidity(listName)) {
            databaseAccess.open();
            databaseAccess.createGList(listName);
            databaseAccess.close();
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
