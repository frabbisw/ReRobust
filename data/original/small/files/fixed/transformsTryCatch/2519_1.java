private void clearForm() {
    try {
        amountEditText.setText("");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    commentEditText.setText("");
    selectedDate = java.util.Calendar.getInstance();
    setInitialDate(selectedDate);
}
