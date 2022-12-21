protected void profileClick(android.view.View view) {
    try {
        startActivity(new android.content.Intent(this, android.duke290.com.loco.ProfileActivity.class));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
}
