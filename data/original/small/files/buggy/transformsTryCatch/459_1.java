public java.util.ArrayList outputUserReport() {
    User user;
    try {
        for (java.lang.Object user1 : users) {
            user = ((User) (user1));
            java.lang.System.out.println(user.createTestUserOutput());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(userEntries);
    return users;
}
