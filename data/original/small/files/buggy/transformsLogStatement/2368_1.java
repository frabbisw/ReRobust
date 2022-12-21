@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    System.out.println("log");
    homePresenter.getPageSuggestions(searchEdittext.getText().toString());
}
