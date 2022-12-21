public java.lang.String getEmail() {
    org.libreplan.business.users.entities.User user = getBoundUser();
    try {
        if (user != null) {
            return user.getEmail();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "";
}
