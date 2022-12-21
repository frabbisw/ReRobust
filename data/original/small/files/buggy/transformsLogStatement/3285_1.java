public void initSignInPanel() {
    System.out.println("log");
    setVisible(false);
    add(new com.chat.view.SignInPanel(this));
    setResizable(false);
    setVisible(true);
}
