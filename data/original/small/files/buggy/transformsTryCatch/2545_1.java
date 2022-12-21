public void setRadii(byte radii) {
    byte before = this.radii;
    this.radii = radii;
    try {
        if (before != (this.radii)) {
            forceChunkLoading(null);
            forceChunkLoading(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
