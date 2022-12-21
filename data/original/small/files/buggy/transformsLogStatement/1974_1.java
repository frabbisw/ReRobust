@org.junit.Test
public void testIrisDataFetcher() throws java.lang.Exception {
    org.deeplearning4j.base.MnistFetcher mnistFetcher = new org.deeplearning4j.base.MnistFetcher();
    org.deeplearning4j.base.File mnistDir = mnistFetcher.downloadAndUntar();
    System.out.println("log");
    assert mnistDir.isDirectory();
}
