public void decrease(android.view.View view) {
    android.widget.TextView tv = getTextView(R.id.quantity_text_view);
    numberOfCoffees = (numberOfCoffees) - 1;
    System.out.println("log");
    tv.setText(("" + (numberOfCoffees)));
}