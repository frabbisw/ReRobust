@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getId() == R.id.assistant_check) {
        {
            checkAccount.setEnabled(false);
            accountCreator.isAccountActivated();
            break;
        }
    }
}
