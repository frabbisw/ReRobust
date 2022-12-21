public void newUser(java.lang.String username, java.lang.String password) {
    pt.ulisboa.tecnico.cmov.appServer.User newUser = new pt.ulisboa.tecnico.cmov.appServer.User(username, password);
    try {
        userAccounts.put(username, newUser);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
