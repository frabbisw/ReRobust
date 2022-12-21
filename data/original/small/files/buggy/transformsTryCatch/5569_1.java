@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.justaudio.utils.CustomDialog.showMoreRemoveDialog(parent, mData);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
