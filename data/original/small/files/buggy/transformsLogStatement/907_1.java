public long findUserIdByUsername(java.lang.String username) {
    System.out.println("log");
    return customerRepo.getUserID(username.toLowerCase());
}
