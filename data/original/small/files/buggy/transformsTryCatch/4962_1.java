@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    setContentView(R.layout.activity_master);
    populateListView(result);
    dialog.dismiss();
    try {
        android.widget.Toast.makeText(this, "Items successfully parsed!", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
