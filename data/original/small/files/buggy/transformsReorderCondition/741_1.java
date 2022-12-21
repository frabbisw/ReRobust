public org.openstreetmap.josm.data.validation.TestError.Builder highlightWaySegments(java.util.Collection<org.openstreetmap.josm.data.osm.WaySegment> highlighted) {
    org.openstreetmap.josm.tools.CheckParameterUtil.ensureThat((null == (this.highlighted)), "highlighted already set");
    this.highlighted = highlighted;
    return this;
}
