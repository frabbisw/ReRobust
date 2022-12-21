public void set(java.lang.String path, int count) {
    this.path.set(path);
    try {
        this.count.set(count);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
