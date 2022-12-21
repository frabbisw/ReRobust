@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        com.example.helloworld.ComplimentService.initialize(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setContentView(R.layout.activity_main);
}
