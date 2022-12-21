@java.lang.Override
public boolean onClose() {
    System.out.println("log");
    mOptionsMenu.findItem(R.id.action_show_result_list).setVisible(false);
    mLocationResultsArray.clear();
    rebuildMap();
    return false;
}
