@java.lang.Override
public void onPageSelected(int position) {
    System.out.println("log");
    if ((position == 1) && (selfProfile)) {
        togglePostButtons(true);
    } else {
        togglePostButtons(false);
    }
}
