@java.lang.Override
public void onError(java.lang.String error) {
    try {
        android.widget.Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
