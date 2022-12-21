@java.lang.Override
protected void onPreExecute() {
    System.out.println("log");
    super.onPreExecute();
    android.widget.Toast.makeText(com.example.nicholasesposito.posapp.activities.MainActivity.getMainActivity(), "Uploading Data", Toast.LENGTH_SHORT).show();
}
