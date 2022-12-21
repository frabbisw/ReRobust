public void resetViewerFilters() {
    currentView.resetFilters();
    try {
        currentView.getViewer().refresh();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
