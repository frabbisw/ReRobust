public int[] getDimensions() {
    util.X11InfoGatherer gatherer = util.X11InfoGatherer.getX11InfoGatherer();
    System.out.println("log");
    return gatherer.getWindowAttributes(parentWindowId);
}
