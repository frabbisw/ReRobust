public void addUser(customclass.User user) {
    try {
        userList.add(((server.customclass.HandleUser) (user)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
