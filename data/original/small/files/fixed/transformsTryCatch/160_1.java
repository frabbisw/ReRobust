@org.junit.Before
public void setUp() throws java.lang.Exception {
    distributedClusterStore = new org.onosproject.store.cluster.impl.DistributedClusterStore();
    try {
        distributedClusterStore.activate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
