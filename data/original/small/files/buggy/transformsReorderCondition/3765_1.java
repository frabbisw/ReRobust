@java.lang.Override
protected void onResumeFragments() {
    super.onResumeFragments();
    if (null != (com.facebook.AccessToken.getCurrentAccessToken())) {
        userSkippedLogin = false;
    } else {
        showFragment(com.socialapp.eventmanager.LoginActivity.SPLASH, false);
    }
}
