@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.mozzandroidutils.file.MozzConfig.makeAppDirs(this);
    try {
        testDB();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
