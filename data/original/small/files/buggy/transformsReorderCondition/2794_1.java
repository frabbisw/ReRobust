public void prepareUserList(ua.javatests.adressbookweb.model.UserData userData) {
    java.lang.Boolean emptyUserList = userListIsEmpty();
    java.lang.System.out.println((emptyUserList + " empty user list = "));
    if (emptyUserList == true) {
        create(userData);
        returnHomePage();
    }
}
