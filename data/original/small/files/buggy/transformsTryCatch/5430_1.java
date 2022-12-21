@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_main);
    try {
        mPresentType = getResources().getStringArray(R.array.present_types);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    buildLoginDialog();
    mLoginDialog.show();
}
