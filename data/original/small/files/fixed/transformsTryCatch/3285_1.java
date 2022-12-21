public void initSignInPanel() {
    setVisible(false);
    try {
        add(new com.chat.view.SignInPanel(this));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setVisible(true);
}
