public org.openstreetmap.josm.data.validation.TestError.Builder highlightWaySegments(java.util.Collection<org.openstreetmap.josm.data.osm.WaySegment> highlighted) {
    try {
        org.openstreetmap.josm.tools.CheckParameterUtil.ensureThat(((this.highlighted) == null), "highlighted already set");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.highlighted = highlighted;
    return this;
}
