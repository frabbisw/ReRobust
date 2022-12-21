@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        setContentView(R.layout.activity_user_login);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    butterknife.ButterKnife.bind(this);
    mToken.setText("63ff7b2bf4977d187fca54489c890cf4");
}
