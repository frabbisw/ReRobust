public void onClick(android.content.DialogInterface dialog, int id) {
    delete = false;
    try {
        dialog.cancel();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
