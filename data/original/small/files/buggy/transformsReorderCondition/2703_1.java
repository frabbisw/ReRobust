@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (null != (mConnectedThread))
        mConnectedThread.cancel();
}
