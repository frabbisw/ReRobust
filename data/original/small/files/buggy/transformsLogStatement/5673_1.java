@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    System.out.println("log");
    if (!hasFocus) {
        mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.GONE);
        blockAndDisableAllButtons();
    } else {
        mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.VISIBLE);
    }
}
