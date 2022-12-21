public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if (null != (mParentDelegate)) {
        bundle = mParentDelegate.mChildKeyTagsBundle;
    }
    onSaveInstanceState(bundle);
    mParentDelegate.mBundle.putAll(bundle);
}
