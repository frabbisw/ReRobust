public boolean addSlices(java.util.Collection<it.polito.atlas.alea2.Slice> slices) {
    try {
        slices.addAll(slices);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
