public void onClick(android.content.DialogInterface dialog, int which) {
    System.out.println("log");
    progressDialog.dismiss();
    getFragmentManager().popBackStack();
}
