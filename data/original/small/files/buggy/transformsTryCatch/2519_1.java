private void clearForm() {
    amountEditText.setText("");
    try {
        commentEditText.setText("");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    selectedDate = java.util.Calendar.getInstance();
    setInitialDate();
}
