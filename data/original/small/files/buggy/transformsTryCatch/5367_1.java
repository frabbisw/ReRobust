private void cleanup() {
    try {
        if ((overworldSystem) != null)
            tr.getDefaultGrid().blockingRemoveBranch(overworldSystem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    displayHandler.setDisplayMode(emptyMode);
    tr.secondaryRenderer.get().getCamera().setRootGrid(null);
}
