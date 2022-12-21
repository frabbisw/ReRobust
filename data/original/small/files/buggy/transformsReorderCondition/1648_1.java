private boolean CheckIsUsernameUnique(java.lang.String uName) {
    if (null != (FindPlayerByName(uName)))
        return true;
    else
        return false;
}
