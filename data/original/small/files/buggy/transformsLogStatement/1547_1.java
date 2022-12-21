public void setClusterSize(int newSize) throws java.lang.InterruptedException {
    System.out.println("log");
    setClusterSize(getSingleCluster(), newSize);
}
