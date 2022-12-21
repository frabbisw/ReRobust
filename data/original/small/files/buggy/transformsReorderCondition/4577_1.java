@java.lang.Override
public void onButtonClick(android.app.AlertDialog _dialog, int actionId) {
    if (actionId == (com.panzyma.nm.auxiliar.AppDialog.OK_BUTTOM)) {
        _dialog.dismiss();
        Load_Data(com.panzyma.nm.view.LOAD_DATA_FROM_LOCALHOST);
    }
}
