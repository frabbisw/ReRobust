@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    switch(view.getId()) {
        case R.id.signInButton:
            signIn();
            break;
        case R.id.signOutButton:
            signOut();
            break;
    }
}
