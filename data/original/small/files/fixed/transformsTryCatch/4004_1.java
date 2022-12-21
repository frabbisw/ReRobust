public void decrease(android.view.View view) {
    try {
        if ((numberOfCoffees) > 0) {
            android.widget.TextView tv = getTextView(R.id.quantity_text_view);
            numberOfCoffees = (numberOfCoffees) - 1;
            tv.setText(("" + (numberOfCoffees)));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
