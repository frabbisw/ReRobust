@java.lang.Override
protected void onCancelled(java.util.ArrayList arrayList) {
    super.onCancelled(arrayList);
    try {
        mViewPagerAdapter.setLoadingNewBill(false, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
