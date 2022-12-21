@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        mBlurEngine.onResume(getRetainInstance());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
