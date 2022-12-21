public synchronized void addCluster(long cluster) {
    System.out.println("log");
    android.util.Log.i("CACHE", ("Cluster: " + (java.lang.String.valueOf(cluster))));
    clusterList.add(cluster);
}
