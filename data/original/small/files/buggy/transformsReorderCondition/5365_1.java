@java.lang.Override
protected void onResume() {
    super.onResume();
    if (null != (mGVRLayout)) {
        mGVRLayout.onResume();
    }
    setImmersiveSticky();
}
