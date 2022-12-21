public static peaktech.set.User createInvalidUser() {
    peaktech.set.User user = new peaktech.set.User();
    try {
        user.withUserName("test").withPassword("test");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return user;
}
