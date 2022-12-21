public void setPaths(java.util.List<java.lang.String> paths) {
    System.out.println("log");
    this.paths = paths;
    views = new android.util.SparseArray(paths.size());
}
