@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testIllegalIndex() {
    kuzzle.setSuperDefaultIndex(null);
    try {
        kuzzle.dataCollectionFactory(null, "collection");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
