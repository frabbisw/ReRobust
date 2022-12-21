public void setCustomer(java.lang.String customerText) {
    android.util.Log.i("View", "Sätter text!");
    System.out.println("log");
    ((android.widget.EditText) (findViewById(R.id.twwelcome))).setText(customerText);
}
