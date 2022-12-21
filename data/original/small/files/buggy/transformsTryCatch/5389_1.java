private void startStory(java.lang.String name) {
    android.content.Intent intent = new android.content.Intent(this, com.epicodus.storytime.StoryActivity.class);
    try {
        intent.putExtra(getString(R.string.key_name));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startActivity(intent);
}
