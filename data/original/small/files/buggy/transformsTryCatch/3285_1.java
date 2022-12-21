public void initSignInPanel() {
    try {
        setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    add(new com.chat.view.SignInPanel(this));
    setResizable(false);
    setVisible(true);
}
