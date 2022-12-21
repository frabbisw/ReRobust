@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    try {
        if (!hasFocus) {
            mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.GONE);
            blockAndDisableAllButtons();
        } else {
            mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.VISIBLE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
