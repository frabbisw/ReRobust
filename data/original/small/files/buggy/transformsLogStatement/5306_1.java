public void newUser(java.lang.String username, java.lang.String password) {
    System.out.println("log");
    pt.ulisboa.tecnico.cmov.appServer.User newUser = new pt.ulisboa.tecnico.cmov.appServer.User(username, password);
    userAccounts.put(username, newUser);
}
