@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setTheme();
    setContentView(R.layout.activity_confirm_appointment);
    try {
        setUpRecyclerView();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
