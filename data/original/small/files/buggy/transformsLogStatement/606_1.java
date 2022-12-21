public void onLoadProductsFail() {
    System.out.println("log");
    android.widget.Toast.makeText(getContext(), R.string.products_load_fail, Toast.LENGTH_SHORT).show();
}
