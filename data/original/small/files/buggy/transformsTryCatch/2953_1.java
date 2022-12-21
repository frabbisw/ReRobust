@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    try {
        if (isDataSet) {
            com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(chosenTime);
        } else {
            com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(getResources().getText(R.string.tid_datum));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
