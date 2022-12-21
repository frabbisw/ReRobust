public void prepareUserList(ua.javatests.adressbookweb.model.UserData userData) {
    java.lang.Boolean emptyUserList = userListIsEmpty();
    try {
        if (emptyUserList == true) {
            create(userData);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
