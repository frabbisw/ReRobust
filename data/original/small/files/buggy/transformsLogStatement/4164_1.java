public void launch(android.view.View v, java.lang.String uid) {
    android.content.Intent login = new android.content.Intent(this, com.cultivate.juniordesign.cultivate.LoginActivity.class);
    login.putExtra("uid", uid);
    System.out.println("log");
    startActivity(login);
}
