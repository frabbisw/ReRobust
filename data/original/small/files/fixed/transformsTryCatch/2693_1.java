@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    try {
        ((com.example.user.worktime.TimeTablePagerFragment) (getParentFragment())).changeSelectedDate(new org.joda.time.LocalDate(year, (month + 1), dayOfMonth));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
