public void prepareUserList(ua.javatests.adressbookweb.model.UserData userData) {
    java.lang.Boolean emptyUserList = userListIsEmpty();
    System.out.println("log");
    java.lang.System.out.println((" empty user list = " + emptyUserList));
    if (emptyUserList == true) {
        create(userData);
        returnHomePage();
    }
}
