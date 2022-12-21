public void onLoadProductsFail() {
    try {
        android.widget.Toast.makeText(getContext(), R.string.products_load_fail, Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
