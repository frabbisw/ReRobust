@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent profileViewIntent = new android.content.Intent(getApplicationContext(), com.socialteinc.socialate.ViewOtherUserProfile.class);
    try {
        profileViewIntent.putExtra("entertainmentUploader", mEntertainmentUploader);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startActivity(profileViewIntent);
}
