@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    dataSource = MainActivity.dataSource;
    dataSource.deleteAllThrows();
    System.out.println("log");
    addDemoThrows();
}
