private void startStory(java.lang.String name) {
    android.content.Intent intent = new android.content.Intent(this, com.epicodus.storytime.StoryActivity.class);
    System.out.println("log");
    intent.putExtra(getString(R.string.key_name));
    startActivity(intent);
}
