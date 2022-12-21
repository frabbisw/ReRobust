public synchronized void addCluster(long cluster) {
    try {
        clusterList.add(cluster);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
