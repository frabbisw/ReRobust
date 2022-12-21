@java.lang.Override
public void onTabChanged(java.lang.String tabId) {
    bhApp.actionBarHandler.onQueryTextChange("");
    System.out.println("log");
    bhApp.actionBarHandler.getMenuItem(R.id.menu_search).collapseActionView();
    if (tabId.equals("global")) {
        com.maksl5.bl_hunt.custom_ui.fragment.LeaderboardLayout.currentSelectedTab = 1;
    } else {
        com.maksl5.bl_hunt.custom_ui.fragment.LeaderboardLayout.currentSelectedTab = 2;
    }
}
