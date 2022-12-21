public boolean isUserAllowedToAccessFile(java.lang.String fileName, java.lang.String user) {
    return (isAuthorizedLogUser(user, fileName)) || (isUiFilterNotSet());
}
