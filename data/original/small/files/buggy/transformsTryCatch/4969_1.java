private android.content.Intent getNotificationIntent() {
    android.content.Intent intent = new android.content.Intent(this, com.codepath.socialshopper.socialshopper.Activities.PickUpList.class);
    try {
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return intent;
}
