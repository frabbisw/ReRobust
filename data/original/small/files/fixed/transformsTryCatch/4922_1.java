@java.lang.Override
public void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (shouldReloadOnResume()) {
        setViewState(ViewState.LOADING);
        getListData(this);
    }
}
