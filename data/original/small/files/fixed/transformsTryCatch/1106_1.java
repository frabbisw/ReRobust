@android.support.annotation.CallSuper
protected void doLoadItems() {
    isLoading = true;
    if ((adapter) != null) {
        adapter.showLoadingState(isLoading);
    }
    onDoLoadItems();
    try {
        timber.log.Timber.d("Loading items ...");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
