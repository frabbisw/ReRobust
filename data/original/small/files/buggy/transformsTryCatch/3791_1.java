@java.lang.Override
public void run() {
    try {
        if (((mSnackbar) != null) && (mSnackbar.isShown())) {
            this.sendEvent(com.lugg.ReactSnackbar.ReactSnackbarModule.EVENT_HIDE, null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
