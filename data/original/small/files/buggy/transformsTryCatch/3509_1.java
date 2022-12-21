@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setContentView(R.layout.activity_normal_key_board);
    valueList = virtualKeyboardView.getValueList();
    initAnim();
    initView();
}
