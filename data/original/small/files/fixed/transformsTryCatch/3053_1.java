private void newPAssError() {
    try {
        android.widget.Toast.makeText(getBaseContext(), "New passwords don't match!", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
