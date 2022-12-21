private void onError() {
    try {
        android.widget.Toast.makeText(this.context, R.string.network_error, Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
