public void clearRegisteredAuthenticationListener() {
    try {
        android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "clearRegisteredAuthenticationListener");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mAuthListener = null;
}
