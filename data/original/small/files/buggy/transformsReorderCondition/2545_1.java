public void setRadii(byte radii) {
    byte before = this.radii;
    this.radii = radii;
    if ((this.radii) != before) {
        forceChunkLoading(null);
        forceChunkLoading(null);
    }
}
