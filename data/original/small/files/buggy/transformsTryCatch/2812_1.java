private void performHideLaunchScreen() {
    mLaunchScreenDialog.dismiss();
    mLaunchScreenDialog = null;
    try {
        if ((mReadyWhen) == (org.xwalk.core.internal.XWalkLaunchScreenManager.ReadyWhenType.CUSTOM)) {
            mActivity.unregisterReceiver(mLaunchScreenReadyWhenReceiver);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
