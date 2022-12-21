public org.openstreetmap.josm.data.validation.TestError.Builder highlightNodePairs(java.util.Collection<java.util.List<org.openstreetmap.josm.data.osm.Node>> highlighted) {
    try {
        org.openstreetmap.josm.tools.CheckParameterUtil.ensureThat(((this.highlighted) == null), "highlighted already set");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.highlighted = highlighted;
    return this;
}
