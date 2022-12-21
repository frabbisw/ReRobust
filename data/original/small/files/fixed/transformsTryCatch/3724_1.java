private void openErrorPopup() {
    try {
        android.widget.Toast.makeText(this, R.string.input_error_msg, Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
