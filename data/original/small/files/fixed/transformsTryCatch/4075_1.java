@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    try {
        super.onDismiss(dialog);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((callback) != null) {
        callback.onDismiss();
    }
}
