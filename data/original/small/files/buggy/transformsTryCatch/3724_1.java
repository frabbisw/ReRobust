private void openErrorPopup() {
    android.widget.Toast popup = android.widget.Toast.makeText(this, R.string.input_error_msg, Toast.LENGTH_SHORT);
    try {
        popup.show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
