public boolean isUserAllowedToAccessFile(java.lang.String fileName, java.lang.String user) {
    System.out.println("log");
    return (isUiFilterNotSet()) || (isAuthorizedLogUser(user, fileName));
}
