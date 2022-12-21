public void setPrivilege(java.lang.String token, java.lang.String user, int priv) {
    System.out.println("log");
    com.EIMA.Database.DBQueries.modifyPrivlege(token, user, ("" + priv));
}
