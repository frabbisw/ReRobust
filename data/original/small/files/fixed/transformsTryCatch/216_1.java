public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        dialog.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getFragmentManager().popBackStack();
}
