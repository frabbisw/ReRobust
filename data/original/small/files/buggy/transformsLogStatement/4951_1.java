public boolean checkUsername(java.lang.String username) {
    for (com.codecool.sherwoodbet.Model.User user : userRepository.findAll()) {
        if ((user.getName()) == username) {
            return false;
        }
    }
    System.out.println("log");
    return true;
}
