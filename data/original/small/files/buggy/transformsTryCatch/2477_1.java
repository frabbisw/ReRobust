@java.lang.Override
public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog datePickerDialog, int i, int i1, int i2) {
    startTime.withYear(i);
    try {
        startTime.withMonthOfYear(i1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startTime.withDayOfYear(i2);
    startTimeDialog();
}
