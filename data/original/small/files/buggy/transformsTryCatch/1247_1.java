public ffk27.mapviewer2.GeoDataSource getDataSource() {
    try {
        if (((dataSource) == null) && ((parent) != null)) {
            return parentDataSource(parent);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return dataSource;
}
