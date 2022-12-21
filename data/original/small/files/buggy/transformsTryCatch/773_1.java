@java.lang.Override
public void onCreate(@android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
}
