public void accessError() {
    try {
        android.widget.Toast.makeText(getApplicationContext(), getResources().getString(R.string.accessErorr), Toast.LENGTH_LONG).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
