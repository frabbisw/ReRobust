@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getSupportFragmentManager().beginTransaction().add(R.id.fragment, new com.weather.portiaprosampleweather.MainActivityFragment()).commit();
    try {
        setContentView(R.layout.activity_main);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
