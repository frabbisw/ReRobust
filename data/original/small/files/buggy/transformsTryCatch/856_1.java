@java.lang.Override
public void onStart() {
    super.onStart();
    try {
        mAuth.addAuthStateListener(mAuthListener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.google.firebase.auth.FirebaseUser currentUser = mAuth.getCurrentUser();
    updateUI(currentUser);
}
