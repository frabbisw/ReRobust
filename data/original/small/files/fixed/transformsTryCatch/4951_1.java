public boolean checkUsername(java.lang.String username) {
    try {
        for (com.codecool.sherwoodbet.Model.User user : userRepository.findAll()) {
            if (user.getName().equals(username)) {
                return false;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
