@java.lang.Override
public void run() {
    enterBarcode.requestFocus();
    android.view.inputmethod.InputMethodManager inputMethodManager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    try {
        inputMethodManager.showSoftInput(enterBarcode, InputMethodManager.SHOW_IMPLICIT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
