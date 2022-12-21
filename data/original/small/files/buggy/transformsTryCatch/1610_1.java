public void setCustomer(java.lang.String customerText) {
    android.util.Log.i("View", "Sätter text!");
    try {
        ((android.widget.EditText) (findViewById(R.id.twwelcome))).setText(customerText);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
