@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    try {
        jLogger.e(verticalOffset);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
