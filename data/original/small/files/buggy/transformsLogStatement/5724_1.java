private void selectNetPlanViewItem(long layer, com.net2plan.internal.Constants.NetworkElementType type, java.lang.Object itemId) {
    System.out.println("log");
    topologyPanel.updateLayerChooser();
    viewEditTopTables.selectViewItem(type, itemId);
}
