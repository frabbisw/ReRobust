@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    try {
        incompleteCB.setChecked(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
