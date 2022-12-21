@java.lang.Override
protected void onResume() {
    super.onResume();
    try {
        if (org.kore.kolabnotes.android.Utils.getReloadDataAfterDetail(this)) {
            org.kore.kolabnotes.android.Utils.setReloadDataAfterDetail(this, false);
            overviewFragment.setFromDetail();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
