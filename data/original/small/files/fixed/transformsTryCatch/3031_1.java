@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        if ((dataSource) == null) {
            dataSource = MainActivity.dataSource;
            dataSource.deleteAllThrows();
            addDemoThrows();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
