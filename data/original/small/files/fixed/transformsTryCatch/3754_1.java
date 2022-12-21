public void addUser(customclass.User user) {
    try {
        userList.add(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
