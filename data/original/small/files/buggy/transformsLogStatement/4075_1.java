@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    System.out.println("log");
    if ((callback) != null) {
        callback.onDismiss();
    }
}
