@java.lang.Override
protected void onResume() {
    super.onResume();
    profile = com.facebook.Profile.getCurrentProfile();
    try {
        nextActivity(profile);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
