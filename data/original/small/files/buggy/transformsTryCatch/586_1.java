public void onClick(android.view.View v) {
    try {
        java.lang.System.out.println("Button clicked");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.String loginString = loginTxt.getText().toString();
    _mClickListener.onLogInClick(loginString);
}
