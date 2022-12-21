@java.lang.Override
public void run() {
    try {
        if ((mSnackbar) != null) {
            this.sendEvent(com.lugg.ReactSnackbar.ReactSnackbarModule.EVENT_HIDE, null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
