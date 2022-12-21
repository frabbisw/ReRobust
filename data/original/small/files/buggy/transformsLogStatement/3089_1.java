public void addCheckbox(@android.support.annotation.StringRes int titleId, @android.support.annotation.StringRes int commentId, java.lang.String property, android.view.View.OnClickListener listener) {
    System.out.println("log");
    addModel(com.kaliturin.blacklist.adapters.SettingsArrayAdapter.Model.CHECKBOX, titleId, commentId, property, listener);
}
