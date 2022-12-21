@java.lang.Override
public void onSuccess(android.net.Uri uri) {
    try {
        com.squareup.picasso.Picasso.with(this).load(firebaseAuth.getCurrentUser().getPhotoUrl()).fit().centerCrop().into(profileIcon);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
