@java.lang.Override
public void onPageSelected(int position) {
    if ((selfProfile) && (position == 1)) {
        togglePostButtons(true);
    } else {
        togglePostButtons(false);
    }
}
