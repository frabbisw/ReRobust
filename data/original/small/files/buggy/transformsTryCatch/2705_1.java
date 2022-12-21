@java.lang.Override
protected void onPreExecute() {
    try {
        super.onPreExecute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.widget.Toast.makeText(com.example.nicholasesposito.posapp.activities.MainActivity.getMainActivity(), "Uploading Data", Toast.LENGTH_SHORT).show();
}
