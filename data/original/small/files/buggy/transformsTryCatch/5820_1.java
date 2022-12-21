@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.roigreenberg.easyshop.MainActivity.ShareList(getBaseContext(), userId, listId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
