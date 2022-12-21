private void sendUserInfo(java.lang.String name, java.lang.String pass) {
    System.out.println("log");
    controller.SignInController controller = this.contr;
    controller.getUserInfo(name, pass);
}
