@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testIllegalIndex() {
    kuzzle.setSuperDefaultIndex(null);
    System.out.println("log");
    kuzzle.dataCollectionFactory(null, "collection");
}
