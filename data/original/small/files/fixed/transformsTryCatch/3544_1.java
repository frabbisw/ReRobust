@java.lang.Override
public void onBackPressed() {
    finishAffinity();
    try {
        startActivity(new android.content.Intent(this, com.johnsimon.payback.ui.FeedActivity.class));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
