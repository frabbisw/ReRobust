@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    try {
        outState.putInt("position", mPairsSpinner.getSelectedItemPosition());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
