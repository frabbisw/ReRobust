@java.lang.Override
protected void onStop() {
    android.util.Log.e(com.example.user.edeasy.Welcome.TAG, "onStop");
    super.onStop();
    try {
        if ((authStateListener) != null)
            auth.removeAuthStateListener(authStateListener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    detachDatabaseListeners();
}
