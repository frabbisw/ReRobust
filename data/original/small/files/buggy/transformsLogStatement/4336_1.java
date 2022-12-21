public boolean accept(java.io.File pathname) {
    System.out.println("log");
    if (pathname.getPath().matches(this.filterRule)) {
        return true;
    } else {
        return false;
    }
}
