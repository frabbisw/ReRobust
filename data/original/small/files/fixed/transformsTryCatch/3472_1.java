@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((getSelectedItemCount()) == 0) {
        recentListActionModeUtil.startActionMode();
    }
    toggleSelection(position);
    try {
        recentListActionModeUtil.updateActionMode(getSelectedItemCount());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
