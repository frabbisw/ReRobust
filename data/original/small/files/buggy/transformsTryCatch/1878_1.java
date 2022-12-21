@java.lang.Override
public void onResume() {
    edu.berkeley.cs.amplab.carat.android.CaratApplication.setActionList(this);
    refresh();
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
