@java.lang.Override
public void onTabChanged(java.lang.String tabId) {
    bhApp.actionBarHandler.onQueryTextChange("");
    try {
        bhApp.actionBarHandler.getMenuItem(R.id.menu_search).collapseActionView();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (tabId.equals("global")) {
        com.maksl5.bl_hunt.custom_ui.fragment.LeaderboardLayout.currentSelectedTab = 1;
    } else {
        com.maksl5.bl_hunt.custom_ui.fragment.LeaderboardLayout.currentSelectedTab = 2;
    }
}
