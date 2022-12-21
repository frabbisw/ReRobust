public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.codepath.packagetwitter.FileUploadActivity.class);
    i.putExtra("USER", org.parceler.Parcels.wrap(user));
    try {
        startActivity(i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
