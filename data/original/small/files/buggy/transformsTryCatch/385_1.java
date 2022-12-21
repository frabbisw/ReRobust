final boolean setLoggedUser(sk.tsystems.forum.entity.User user) {
    try {
        setSessionObject(sk.tsystems.forum.servlets.ServletHelper.USER_SESSION_IDENT, user.getId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
