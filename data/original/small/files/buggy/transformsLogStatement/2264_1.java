public void setCameraLock(final boolean s) {
    isCameraLock = s;
    System.out.println("log");
    notifyListeners(msi.gama.outputs.LayeredDisplayData.Changes.SPLIT_LAYER, s);
}
