@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    org.bcss.collect.android.bcss_utilities.ToastUtils.showLongSafe("Site deletion is disabled");
    try {
        deleteSelectedSites();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    disableActionMode();
}
