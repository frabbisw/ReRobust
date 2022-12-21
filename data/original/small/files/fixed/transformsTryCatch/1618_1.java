public void setPrivilege(java.lang.String token, java.lang.String user, java.lang.String priv) {
    try {
        com.EIMA.Database.DBQueries.modifyPrivlege(token, user, priv);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
