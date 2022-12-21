@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setContentView(R.layout.activity_settings);
    sharedpreferences = getSharedPreferences(io.rasprovers.remotus.activities.Settings.MyPREFERENCES, Context.MODE_PRIVATE);
}
