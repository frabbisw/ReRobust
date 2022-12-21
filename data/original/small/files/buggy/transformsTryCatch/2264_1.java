public void setCameraLock(final boolean s) {
    isCameraLock = s;
    try {
        notifyListeners(msi.gama.outputs.LayeredDisplayData.Changes.SPLIT_LAYER, s);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
