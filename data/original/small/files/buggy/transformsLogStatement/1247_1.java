public ffk27.mapviewer2.GeoDataSource getDataSource() {
    System.out.println("log");
    if (((dataSource) == null) && ((parent) != null)) {
        return parentDataSource(parent);
    }
    return dataSource;
}
