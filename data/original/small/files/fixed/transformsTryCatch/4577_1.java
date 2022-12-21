@java.lang.Override
public void onButtonClick(android.app.AlertDialog _dialog, int actionId) {
    try {
        if ((com.panzyma.nm.auxiliar.AppDialog.OK_BUTTOM) == actionId) {
            Load_Data(com.panzyma.nm.view.LOAD_DATA_FROM_LOCALHOST);
            _dialog.dismiss();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
