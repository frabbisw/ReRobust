private void performHideLaunchScreen() {
    System.out.println("log");
    mLaunchScreenDialog.dismiss();
    mLaunchScreenDialog = null;
    if ((mReadyWhen) == (org.xwalk.core.internal.XWalkLaunchScreenManager.ReadyWhenType.CUSTOM)) {
        mActivity.unregisterReceiver(mLaunchScreenReadyWhenReceiver);
    }
}
