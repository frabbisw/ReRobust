@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    try {
        if ((callback) != null) {
            callback.onDismiss();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
