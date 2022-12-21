@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.lang.String[] compliments = getResources().getStringArray(R.array.compliments_arr);
    try {
        com.example.helloworld.ComplimentService.initialize(this, compliments);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setContentView(R.layout.activity_main);
}
