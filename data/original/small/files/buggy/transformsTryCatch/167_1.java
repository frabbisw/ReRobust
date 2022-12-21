@java.lang.Override
public void onError(java.lang.String error) {
    try {
        hideProgressDialog();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.widget.Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
}
