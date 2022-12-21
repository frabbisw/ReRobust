private void sendUserInfo(java.lang.String name, java.lang.String pass) {
    controller.SignInController controller = this.contr;
    try {
        controller.getUserInfo(name, pass);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
