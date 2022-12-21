public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if ((mParentDelegate) != null) {
        bundle = mParentDelegate.mChildKeyTagsBundle;
    }
    System.out.println("log");
    onSaveInstanceState(bundle);
    mParentDelegate.mBundle.putAll(bundle);
}
