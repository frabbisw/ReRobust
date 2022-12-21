@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    switch(v.getId()) {
        case R.id.assistant_check:
            {
                checkAccount.setEnabled(false);
                accountCreator.isAccountActivated();
                break;
            }
    }
}
