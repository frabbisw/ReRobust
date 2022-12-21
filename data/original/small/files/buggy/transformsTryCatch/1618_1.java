public void setPrivilege(java.lang.String token, java.lang.String user, int priv) {
    try {
        com.EIMA.Database.DBQueries.modifyPrivlege(token, user, ("" + priv));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
