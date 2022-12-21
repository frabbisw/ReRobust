public synchronized void addCluster(long cluster) {
    try {
        android.util.Log.i("CACHE", ("Cluster: " + (java.lang.String.valueOf(cluster))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    clusterList.add(cluster);
}
