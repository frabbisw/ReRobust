@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, @android.support.annotation.IdRes int checkedId) {
    if ((R.id.radioMale) == checkedId) {
        gender = 1;
    } else {
        gender = 0;
    }
}
