@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    exportCsv();
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
