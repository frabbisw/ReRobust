@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    android.content.Intent profileViewIntent = new android.content.Intent(getApplicationContext(), com.socialteinc.socialate.ViewOtherUserProfile.class);
    profileViewIntent.putExtra("entertainmentUploader", mEntertainmentUploader);
    profileViewIntent.putExtra("entertainmentKey", mEntertainmentKey);
    startActivity(profileViewIntent);
}
