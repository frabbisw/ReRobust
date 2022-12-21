@java.lang.Override
protected void onResumeFragments() {
    super.onResumeFragments();
    System.out.println("log");
    if ((com.facebook.AccessToken.getCurrentAccessToken()) != null) {
        userSkippedLogin = false;
    } else {
        showFragment(com.socialapp.eventmanager.LoginActivity.SPLASH, false);
    }
}
