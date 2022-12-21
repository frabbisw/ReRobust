@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    try {
        setContentView(getLayoutResource());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    butterknife.ButterKnife.inject(this);
}
