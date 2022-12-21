@java.lang.Override
public void onResume() {
    System.out.println("log");
    super.onResume();
    adapter.registerAdapterDataObserver(dataObserver);
    if (shouldReloadOnResume()) {
        setViewState(ViewState.LOADING);
        getListData(this);
    }
}
