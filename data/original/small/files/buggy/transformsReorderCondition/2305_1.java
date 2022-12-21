@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if ((android.view.inputmethod.EditorInfo.IME_ACTION_DONE) == actionId) {
        commentPresenter.validateComment(v.getText().toString());
    }
    return false;
}
