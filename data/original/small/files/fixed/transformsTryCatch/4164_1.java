public void launch(android.view.View v) {
    android.content.Intent login = new android.content.Intent(this, com.cultivate.juniordesign.cultivate.LoginActivity.class);
    try {
        startActivity(login);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
