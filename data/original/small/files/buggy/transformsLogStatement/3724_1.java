private void openErrorPopup() {
    android.widget.Toast popup = android.widget.Toast.makeText(this, R.string.input_error_msg, Toast.LENGTH_SHORT);
    System.out.println("log");
    popup.show();
}
