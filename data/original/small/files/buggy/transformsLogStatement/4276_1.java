public void resetViewerFilters() {
    System.out.println("log");
    currentView.resetFilters();
    currentView.getViewer().refresh();
}
