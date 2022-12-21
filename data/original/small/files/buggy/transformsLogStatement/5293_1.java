@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    System.out.println("log");
    outState.putInt("position", mPairsSpinner.getSelectedItemPosition());
}
