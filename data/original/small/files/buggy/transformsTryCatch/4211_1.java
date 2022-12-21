@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    try {
        android.widget.Toast.makeText(this, "Sent Information to Server...", Toast.LENGTH_LONG);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.widget.Toast.makeText(this, s, Toast.LENGTH_LONG);
}
