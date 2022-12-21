@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    try {
        dialogInterface.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
}
