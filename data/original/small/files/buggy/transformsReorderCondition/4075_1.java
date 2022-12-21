@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if (null != (callback)) {
        callback.onDismiss();
    }
}
