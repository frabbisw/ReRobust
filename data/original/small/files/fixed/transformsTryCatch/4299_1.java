public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if (((mParentDelegate) != null) && ((mParentDelegate.mBundle) != null)) {
        bundle = mParentDelegate.mBundle;
    }
    try {
        onSaveInstanceState(bundle);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
