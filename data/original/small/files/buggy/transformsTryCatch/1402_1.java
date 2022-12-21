public void setPaths(java.util.List<java.lang.String> paths) {
    this.paths = paths;
    try {
        views = new android.util.SparseArray(paths.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
