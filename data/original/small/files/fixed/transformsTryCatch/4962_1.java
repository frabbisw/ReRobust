@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    populateListView(result);
    try {
        dialog.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.widget.Toast.makeText(this, "Items successfully parsed!", Toast.LENGTH_SHORT).show();
}
