public org.openstreetmap.josm.data.osm.OsmPrimitive get(int idx) {
    if (null == (conflicts))
        return null;
    return conflicts.get(idx).getMy();
}
