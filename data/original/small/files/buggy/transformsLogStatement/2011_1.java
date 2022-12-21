@java.lang.Override
public void onSuccess(android.net.Uri uri) {
    System.out.println("log");
    com.squareup.picasso.Picasso.with(this).load(firebaseAuth.getCurrentUser().getPhotoUrl()).fit().centerCrop().into(profileIcon);
}
