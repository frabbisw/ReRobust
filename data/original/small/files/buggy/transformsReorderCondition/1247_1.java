public ffk27.mapviewer2.GeoDataSource getDataSource() {
    if (((parent) != null) && ((dataSource) == null)) {
        return parentDataSource(parent);
    }
    return dataSource;
}
