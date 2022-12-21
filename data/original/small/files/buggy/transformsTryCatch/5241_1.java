@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    try {
        super.onPostExecute(s);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.widget.Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
}
