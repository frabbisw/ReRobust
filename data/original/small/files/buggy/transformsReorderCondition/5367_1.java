private void cleanup() {
    if (null != (overworldSystem))
        tr.getDefaultGrid().blockingRemoveBranch(overworldSystem);
    displayHandler.setDisplayMode(emptyMode);
    tr.secondaryRenderer.get().getCamera().setRootGrid(null);
}
