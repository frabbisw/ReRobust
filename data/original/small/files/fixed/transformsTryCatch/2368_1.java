@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    try {
        if (editable.toString().trim().isEmpty()) {
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    homePresenter.getPageSuggestions(searchEdittext.getText().toString());
}
