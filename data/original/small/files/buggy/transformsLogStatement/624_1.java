@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    System.out.println("log");
    setContentView(getLayoutResource());
    butterknife.ButterKnife.inject(this);
}
