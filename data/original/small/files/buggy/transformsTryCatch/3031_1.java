@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    dataSource = MainActivity.dataSource;
    try {
        dataSource.deleteAllThrows();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addDemoThrows();
}
