public void deleteUser(isc.intake2.online_test.entities.User user) {
    try {
        super.delete(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
