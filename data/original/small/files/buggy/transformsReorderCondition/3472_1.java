@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (0 == (getSelectedItemCount())) {
        recentListActionModeUtil.startActionMode();
    }
    toggleSelection(position);
    recentListActionModeUtil.updateActionMode(getItemCount());
    return true;
}
