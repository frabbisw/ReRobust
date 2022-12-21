public void decrease(android.view.View view) {
    android.widget.TextView tv = getTextView(R.id.quantity_text_view);
    numberOfCoffees = (numberOfCoffees) - 1;
    try {
        tv.setText(("" + (numberOfCoffees)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
