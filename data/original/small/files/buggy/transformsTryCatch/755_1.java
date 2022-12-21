@java.lang.Override
public void onClick(android.view.View v) {
    try {
        communicator.onDialogMessage("false");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dismiss();
}
