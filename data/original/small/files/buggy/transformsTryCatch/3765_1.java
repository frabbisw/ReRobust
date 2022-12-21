@java.lang.Override
protected void onResumeFragments() {
    try {
        super.onResumeFragments();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((com.facebook.AccessToken.getCurrentAccessToken()) != null) {
        userSkippedLogin = false;
    } else {
        showFragment(com.socialapp.eventmanager.LoginActivity.SPLASH, false);
    }
}
