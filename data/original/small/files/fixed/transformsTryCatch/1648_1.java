private boolean CheckIsUsernameUnique(java.lang.String uName) {
    try {
        if ((FindPlayerByName(uName)) == null)
            return true;
        else
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
