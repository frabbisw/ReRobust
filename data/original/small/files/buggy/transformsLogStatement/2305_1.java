@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    System.out.println("log");
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        commentPresenter.validateComment(v.getText().toString());
    }
    return false;
}
