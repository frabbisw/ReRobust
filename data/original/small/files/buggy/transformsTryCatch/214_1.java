public void refresh(android.app.Activity activity) {
    mActivity = activity;
    try {
        new net.skweez.sipgate.model.AccountInfo.RefreshAccountInfoTask(mActivity).execute(((java.lang.Void) (null)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
