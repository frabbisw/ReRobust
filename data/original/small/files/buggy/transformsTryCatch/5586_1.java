@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        abort(null, returnToChooser);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
