private void selectNetPlanViewItem(long layer, com.net2plan.internal.Constants.NetworkElementType type, java.lang.Object itemId) {
    topologyPanel.updateLayerChooser();
    try {
        viewEditTopTables.selectViewItem(type, itemId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
