@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_normal_key_board);
    try {
        initAnim();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initView();
    valueList = virtualKeyboardView.getValueList();
}
