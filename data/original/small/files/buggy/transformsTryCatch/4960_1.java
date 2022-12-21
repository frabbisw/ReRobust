@java.lang.Override
protected void onCancelled(java.util.ArrayList arrayList) {
    try {
        super.onCancelled(arrayList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mViewPagerAdapter.setLoadingNewBill(false, false);
    android.util.Log.d("FragmentNewBill", "onCancelled.");
}
