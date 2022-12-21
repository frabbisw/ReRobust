@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    try {
        mBirthday.setText(((((dayOfMonth + "-") + (monthOfYear + 1)) + "-") + year));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
