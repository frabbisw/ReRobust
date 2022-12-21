@java.lang.Override
public void onCreate(@android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("log");
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
}
