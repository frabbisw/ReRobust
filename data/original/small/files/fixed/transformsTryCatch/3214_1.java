@java.lang.Override
public void run() {
    android.content.Intent newActivity = new android.content.Intent(this, com.itproject.android.androidtvsample.ListActivity.class);
    try {
        newActivity.putExtra("UNAME", username);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    newActivity.putExtra("HOURS", numberofhours);
    startActivity(newActivity);
}
