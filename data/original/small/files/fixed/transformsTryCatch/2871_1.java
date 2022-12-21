@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    try {
        if (isChecked) {
            incompleteCB.setChecked(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
