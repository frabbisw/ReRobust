@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    System.out.println("log");
    setContentView(R.layout.activity_master);
    populateListView(result);
    dialog.dismiss();
    android.widget.Toast.makeText(this, "Items successfully parsed!", Toast.LENGTH_SHORT).show();
}
