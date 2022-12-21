public void setClusterSize(int newSize) throws java.lang.InterruptedException {
    try {
        setClusterSize(getSingleCluster(), newSize);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
