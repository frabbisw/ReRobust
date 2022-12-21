@java.lang.Override
protected void onResumeFragments() {
    super.onResumeFragments();
    try {
        if ((com.facebook.AccessToken.getCurrentAccessToken()) != null) {
            userSkippedLogin = false;
        } else {
            showFragment(com.socialapp.eventmanager.LoginActivity.SPLASH, true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
