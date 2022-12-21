@java.lang.Override
public void onResume() {
    try {
        refresh();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onResume();
}
