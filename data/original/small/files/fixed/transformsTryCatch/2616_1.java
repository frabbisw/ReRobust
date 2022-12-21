private void showTimePickerDialog(android.widget.EditText timeDisplay, java.util.Calendar date) {
    activeTimeDisplay = timeDisplay;
    activeTime = date;
    android.app.DialogFragment newFragment = new com.project.team16.nfclock.timePickerFragment();
    try {
        newFragment.show(getFragmentManager(), "myDialog");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
