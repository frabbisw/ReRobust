@java.lang.Override
public void run() {
    isShowingRecents = false;
    taskbar.setVisibility(View.GONE);
    try {
        divider.setVisibility(View.GONE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
