@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    try {
        com.mozzandroidutils.file.MozzConfig.makeAppDirs(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    testEloquentCreate();
    testDB();
}
