@java.lang.Override
public void onBackPressed() {
    try {
        if (!(backgroundPrefValue.equals(pref_background.getValue()))) {
            finishAffinity();
            startActivity(new android.content.Intent(this, com.johnsimon.payback.ui.FeedActivity.class));
        } else {
            super.onBackPressed();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
