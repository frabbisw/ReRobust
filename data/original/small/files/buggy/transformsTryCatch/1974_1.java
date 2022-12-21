@org.junit.Test
public void testIrisDataFetcher() throws java.lang.Exception {
    org.deeplearning4j.base.MnistFetcher mnistFetcher = new org.deeplearning4j.base.MnistFetcher();
    org.deeplearning4j.base.File mnistDir = mnistFetcher.downloadAndUntar();
    try {
        assert mnistDir.isDirectory();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
