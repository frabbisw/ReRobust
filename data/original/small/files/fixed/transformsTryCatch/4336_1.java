public boolean accept(java.io.File pathname) {
    try {
        if (pathname.getName().matches(this.filterRule)) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
