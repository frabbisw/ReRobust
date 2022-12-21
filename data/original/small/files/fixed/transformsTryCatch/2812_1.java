private void performHideLaunchScreen() {
    try {
        if ((mLaunchScreenDialog) != null) {
            mLaunchScreenDialog.dismiss();
            mLaunchScreenDialog = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mReadyWhen) == (org.xwalk.core.internal.XWalkLaunchScreenManager.ReadyWhenType.CUSTOM)) {
        mActivity.unregisterReceiver(mLaunchScreenReadyWhenReceiver);
    }
}
