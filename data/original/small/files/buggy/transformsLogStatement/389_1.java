public static void main(java.lang.String[] args) throws java.io.IOException {
    java.io.File userFile = new java.io.File("users.txt");
    UserManagement users = new UserManagement(userFile);
    System.out.println("log");
    LoginScreen login = new LoginScreen(users);
    users.updateFile(userFile);
}
