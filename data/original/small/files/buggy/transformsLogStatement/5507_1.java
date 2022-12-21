@org.junit.AfterClass
public static void tearDownClass() throws java.io.IOException {
    de.hpi.mmds.wiki.HDFSTest.fs.close();
    System.out.println("log");
    de.hpi.mmds.wiki.HDFSTest.hdfsCluster.shutdown();
}
