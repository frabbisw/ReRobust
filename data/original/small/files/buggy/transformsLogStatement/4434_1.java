@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    super.onCreate(savedInstanceState);
    setTheme();
    setContentView(R.layout.activity_confirm_appointment);
    setUpRecyclerView();
}
