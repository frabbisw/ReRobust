private void performHideLaunchScreen() {
    mLaunchScreenDialog.dismiss();
    mLaunchScreenDialog = null;
    if ((org.xwalk.core.internal.XWalkLaunchScreenManager.ReadyWhenType.CUSTOM) == (mReadyWhen)) {
        mActivity.unregisterReceiver(mLaunchScreenReadyWhenReceiver);
    }
}
