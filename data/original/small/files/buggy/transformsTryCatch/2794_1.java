public void prepareUserList(ua.javatests.adressbookweb.model.UserData userData) {
    java.lang.Boolean emptyUserList = userListIsEmpty();
    java.lang.System.out.println((" empty user list = " + emptyUserList));
    try {
        if (emptyUserList == true) {
            create(userData);
            returnHomePage();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
