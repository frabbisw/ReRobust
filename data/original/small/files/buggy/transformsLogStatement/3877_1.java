@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, @android.support.annotation.IdRes int checkedId) {
    System.out.println("log");
    if (checkedId == (R.id.radioMale)) {
        gender = 1;
    } else {
        gender = 0;
    }
}
