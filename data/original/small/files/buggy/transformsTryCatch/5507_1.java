@org.junit.AfterClass
public static void tearDownClass() throws java.io.IOException {
    de.hpi.mmds.wiki.HDFSTest.fs.close();
    try {
        de.hpi.mmds.wiki.HDFSTest.hdfsCluster.shutdown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
