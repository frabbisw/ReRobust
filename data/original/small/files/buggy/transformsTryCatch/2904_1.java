@java.lang.Override
protected void onPrepareDialogBuilder(final android.app.AlertDialog.Builder builder) {
    try {
        builder.setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, this).setNeutralButton(R.string.button_default, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
