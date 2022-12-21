@java.lang.Override
public void restoreUiState(@android.support.annotation.NonNull android.os.Bundle savedInstanceState) {
    try {
        super.restoreUiState(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    progressLoading.setVisibility((savedInstanceState.getBoolean("progressLoadingVisible") ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    btnLoad.setEnabled(savedInstanceState.getBoolean("btnLoadEnabled"));
}
