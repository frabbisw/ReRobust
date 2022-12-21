public void setPaths(java.util.List<java.lang.String> paths) {
    if (paths == null) {
        paths = new java.util.ArrayList<>();
    }
    this.paths = paths;
    try {
        views = new android.util.SparseArray(paths.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
