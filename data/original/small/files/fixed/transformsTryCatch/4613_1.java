@java.lang.Override
public void onClick(android.view.View v) {
    int id = v.getId();
    try {
        if (id == (R.id.assistant_check)) {
            checkAccount.setEnabled(false);
            accountCreator.isAccountActivated();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
