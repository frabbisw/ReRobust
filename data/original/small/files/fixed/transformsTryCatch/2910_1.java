@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        takeView();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
