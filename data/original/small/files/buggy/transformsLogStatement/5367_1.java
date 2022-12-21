private void cleanup() {
    if ((overworldSystem) != null)
        tr.getDefaultGrid().blockingRemoveBranch(overworldSystem);
    displayHandler.setDisplayMode(emptyMode);
    System.out.println("log");
    tr.secondaryRenderer.get().getCamera().setRootGrid(null);
}
