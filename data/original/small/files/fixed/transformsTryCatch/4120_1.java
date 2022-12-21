public void removeUser(java.lang.String user) {
    java.lang.String where = ("user LIKE \"" + user) + "\"";
    try {
        database.delete(com.michael.database.CookieTable.TABLE, where, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
