public void onClick(android.content.DialogInterface dialog, int id) {
    try {
        dialog.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    saveData();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.ast.blocksave.DashboardActivity.class);
    startActivity(intent);
}
