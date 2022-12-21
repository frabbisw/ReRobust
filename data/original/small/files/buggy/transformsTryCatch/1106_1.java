@android.support.annotation.CallSuper
@java.lang.Override
public void doLoadItems() {
    isLoading = true;
    if ((adapter) != null) {
        adapter.showLoadingState(true);
    }
    onDoLoadItems();
    try {
        timber.log.Timber.d("Loading items ...");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
