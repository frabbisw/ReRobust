public void refresh(android.app.Activity activity) {
    mActivity = activity;
    try {
        new net.skweez.sipgate.model.AccountInfo.RefreshAccountInfoTask().execute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
