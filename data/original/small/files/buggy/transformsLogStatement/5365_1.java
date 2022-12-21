@java.lang.Override
protected void onResume() {
    System.out.println("log");
    super.onResume();
    if ((mGVRLayout) != null) {
        mGVRLayout.onResume();
    }
    setImmersiveSticky();
}
