@java.lang.Override
protected void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (org.kore.kolabnotes.android.Utils.getReloadDataAfterDetail(this)) {
        org.kore.kolabnotes.android.Utils.setReloadDataAfterDetail(this, false);
    }
}
