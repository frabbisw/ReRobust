@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    onHandleExtras(savedInstanceState, getIntent().getExtras());
    onLoadContent(savedInstanceState);
    try {
        onLoadModules(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
