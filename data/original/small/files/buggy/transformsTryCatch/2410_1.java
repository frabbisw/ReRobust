@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int selectedYear, int selectedMonth, int selectedDay) {
    selectedMonth = selectedMonth + 1;
    try {
        dateET.setText(((((selectedDay + "/") + selectedMonth) + "/") + selectedYear));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
