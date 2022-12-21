@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    try {
        if (isDataSet) {
            com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(chosenTime);
        } else {
            com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
