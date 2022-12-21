@java.lang.Override
public void run() {
    System.out.println("log");
    if (((mSnackbar) != null) && (mSnackbar.isShown())) {
        this.sendEvent(com.lugg.ReactSnackbar.ReactSnackbarModule.EVENT_HIDE, null);
    }
}
