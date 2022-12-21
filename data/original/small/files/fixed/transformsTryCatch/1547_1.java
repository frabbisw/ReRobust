public void setClusterSize(int newSize) throws java.lang.InterruptedException {
    try {
        setClusterSize(getSingleCluster().getName(), newSize);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
