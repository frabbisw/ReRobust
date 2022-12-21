@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("log");
    if (savedInstanceState == null) {
        handleIntent(getIntent());
    }
}
