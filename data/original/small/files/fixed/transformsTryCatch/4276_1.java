public void resetViewerFilters() {
    currentView.resetFilters();
    try {
        currentView.getViewer().refresh(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
