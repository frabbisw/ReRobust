public void onClick(android.view.View v) {
    java.lang.System.out.println("Button clicked");
    System.out.println("log");
    java.lang.String loginString = loginTxt.getText().toString();
    _mClickListener.onLogInClick(loginString);
}
