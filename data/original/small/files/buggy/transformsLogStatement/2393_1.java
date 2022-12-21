@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    System.out.println("log");
    if (isChecked) {
        leftflag = true;
    } else {
        leftflag = false;
    }
}
