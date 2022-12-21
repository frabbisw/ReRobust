@java.lang.Override
protected void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mGVRLayout) != null) {
        mGVRLayout.onResume();
    }
    setImmersiveSticky();
}
