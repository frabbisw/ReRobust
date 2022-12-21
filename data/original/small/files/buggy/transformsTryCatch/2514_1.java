@java.lang.Override
public boolean onClose() {
    try {
        mOptionsMenu.findItem(R.id.action_show_result_list).setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mLocationResultsArray.clear();
    rebuildMap();
    return false;
}
