@java.lang.Override
public void onClick(android.view.View v) {
    try {
        switch(v.getId()) {
            case R.id.assistant_check:
                {
                    checkAccount.setEnabled(false);
                    accountCreator.isAccountActivated();
                    break;
                }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
