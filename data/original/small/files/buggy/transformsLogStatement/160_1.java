@org.junit.Before
public void setUp() throws java.lang.Exception {
    System.out.println("log");
    distributedClusterStore = new org.onosproject.store.cluster.impl.DistributedClusterStore();
    distributedClusterStore.activate(null);
}
