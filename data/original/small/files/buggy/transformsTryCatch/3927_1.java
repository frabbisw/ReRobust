@java.lang.Override
public void onFailure(java.lang.Error error) {
    timber.log.Timber.e(error.getMessage());
    try {
        android.widget.Toast.makeText(this, error.getMessage(), Toast.LENGTH_LONG).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
