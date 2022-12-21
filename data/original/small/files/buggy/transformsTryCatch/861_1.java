@java.lang.Override
public void onClick(android.view.View view) {
    try {
        switch(view.getId()) {
            case R.id.signInButton:
                signIn();
                break;
            case R.id.signOutButton:
                signOut();
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
