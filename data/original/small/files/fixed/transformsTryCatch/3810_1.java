public java.lang.String saveUser() {
    try {
        userDao.add(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return index();
}
