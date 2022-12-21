private void clearForm() {
    amountEditText.setText("");
    commentEditText.setText("");
    selectedDate = java.util.Calendar.getInstance();
    System.out.println("log");
    setInitialDate();
}
