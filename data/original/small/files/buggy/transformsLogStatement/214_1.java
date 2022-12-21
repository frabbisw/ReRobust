public void refresh(android.app.Activity activity) {
    System.out.println("log");
    mActivity = activity;
    new net.skweez.sipgate.model.AccountInfo.RefreshAccountInfoTask(mActivity).execute(((java.lang.Void) (null)));
}
