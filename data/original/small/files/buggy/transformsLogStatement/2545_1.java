public void setRadii(byte radii) {
    byte before = this.radii;
    System.out.println("log");
    this.radii = radii;
    if (before != (this.radii)) {
        forceChunkLoading(null);
        forceChunkLoading(null);
    }
}
