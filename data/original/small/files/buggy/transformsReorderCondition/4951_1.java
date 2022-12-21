public boolean checkUsername(java.lang.String username) {
    for (com.codecool.sherwoodbet.Model.User user : userRepository.findAll()) {
        if (username == (user.getName())) {
            return false;
        }
    }
    return true;
}
