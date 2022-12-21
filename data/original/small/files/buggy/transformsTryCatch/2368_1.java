@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    try {
        homePresenter.getPageSuggestions(searchEdittext.getText().toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
