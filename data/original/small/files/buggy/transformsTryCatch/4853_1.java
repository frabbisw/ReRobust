@java.lang.Override
public void onPageSelected(int position) {
    try {
        if ((position == 1) && (selfProfile)) {
            togglePostButtons(true);
        } else {
            togglePostButtons(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
