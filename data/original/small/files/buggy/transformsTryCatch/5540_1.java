private void signInGoogle() {
    android.content.Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(SIM.getmGoogleApiClient());
    try {
        startActivityForResult(signInIntent, nl.rug.www.summerschool.controller.myprofile.SignInFragment.GOOGLE_SIGN_IN);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
