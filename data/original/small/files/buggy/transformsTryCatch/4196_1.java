@java.lang.Override
public void onClick(android.view.View v) {
    notifyReadOnlineBackupsFailed();
    try {
        dlg.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
