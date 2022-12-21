@java.lang.Override
protected void restoreUiState(@android.support.annotation.NonNull android.os.Bundle savedInstanceState) {
    super.restoreUiState(savedInstanceState);
    try {
        progressLoading.setVisibility((savedInstanceState.getBoolean("progressLoadingVisible") ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    btnLoad.setEnabled(savedInstanceState.getBoolean("btnLoadEnabled"));
}
