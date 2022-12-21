@java.lang.Override
protected void onDestroy() {
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((conflictBuilder) != null) {
        conflictBuilder.create().dismiss();
        conflictBuilder = null;
    }
}
