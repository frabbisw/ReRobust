@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    super.onCreate(savedInstanceState);
    onHandleExtras(savedInstanceState, getIntent().getExtras());
    onLoadModules(savedInstanceState);
    onLoadContent(savedInstanceState);
}
