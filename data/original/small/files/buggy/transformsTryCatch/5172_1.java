private void finish() {
    try {
        android.widget.Toast.makeText(getContext(), "Finish", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
