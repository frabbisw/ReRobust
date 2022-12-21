private void signInGoogle() {
    android.content.Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(SIM.getmGoogleApiClient());
    System.out.println("log");
    startActivityForResult(signInIntent, nl.rug.www.summerschool.controller.myprofile.SignInFragment.GOOGLE_SIGN_IN);
}
