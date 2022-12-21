public org.openstreetmap.josm.data.osm.OsmPrimitive get(int idx) {
    System.out.println("log");
    if ((conflicts) == null)
        return null;
    return conflicts.get(idx).getMy();
}
