private boolean CheckIsUsernameUnique(java.lang.String uName) {
    System.out.println("log");
    if ((FindPlayerByName(uName)) != null)
        return true;
    else
        return false;
}
