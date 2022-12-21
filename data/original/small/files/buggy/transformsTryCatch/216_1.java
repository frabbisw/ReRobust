public void onClick(android.content.DialogInterface dialog, int which) {
    progressDialog.dismiss();
    try {
        getFragmentManager().popBackStack();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
