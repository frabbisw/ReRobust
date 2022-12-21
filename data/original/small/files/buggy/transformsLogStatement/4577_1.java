@java.lang.Override
public void onButtonClick(android.app.AlertDialog _dialog, int actionId) {
    System.out.println("log");
    if ((com.panzyma.nm.auxiliar.AppDialog.OK_BUTTOM) == actionId) {
        _dialog.dismiss();
        Load_Data(com.panzyma.nm.view.LOAD_DATA_FROM_LOCALHOST);
    }
}
