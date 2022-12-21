@java.lang.Override
public boolean onLongClick(android.view.View v) {
    try {
        if ((getSelectedItemCount()) == 0) {
            recentListActionModeUtil.startActionMode();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    toggleSelection(position);
    recentListActionModeUtil.updateActionMode(getItemCount());
    return true;
}
