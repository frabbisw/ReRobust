public void setCustomer(java.lang.String customerText) {
    try {
        ((android.widget.EditText) (findViewById(R.id.twwelcome))).setText(customerText);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
