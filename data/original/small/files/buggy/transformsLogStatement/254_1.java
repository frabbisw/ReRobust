@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    System.out.println("log");
    com.mozzandroidutils.file.MozzConfig.makeAppDirs(this);
    testEloquentCreate();
    testDB();
}
