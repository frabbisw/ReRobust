@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    try {
        if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
            commentPresenter.validateComment(v.getText().toString());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
