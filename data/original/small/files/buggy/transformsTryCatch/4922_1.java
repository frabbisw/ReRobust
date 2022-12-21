@java.lang.Override
public void onResume() {
    super.onResume();
    adapter.registerAdapterDataObserver(dataObserver);
    try {
        if (shouldReloadOnResume()) {
            setViewState(ViewState.LOADING);
            getListData(this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
