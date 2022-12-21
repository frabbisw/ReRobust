@java.lang.Override
public void onClick(android.view.View view) {
    if (view.getId() == R.id.signInButton) {
        signIn();
    } else if (view.getId() == R.id.signOutButton) {
        signOut();
    }
}
