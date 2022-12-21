public boolean addSlices(java.util.Collection<it.polito.atlas.alea2.Slice> slices) {
    try {
        this.slices.addAll(slices);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
