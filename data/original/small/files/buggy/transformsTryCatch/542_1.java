public void nextActivity() {
    android.content.Intent templateIntent = new android.content.Intent(currentActivity, com.example.kbb12.dms.Template.TemplateActivity.class);
    templateIntent.putExtra("UserModel", model);
    try {
        currentActivity.startActivity(templateIntent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
