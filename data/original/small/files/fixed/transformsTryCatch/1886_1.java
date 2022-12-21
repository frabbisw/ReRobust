@java.lang.Override
public void testLoad() throws java.io.IOException {
    try {
        r = io.kaitai.struct.testformats.BenchmarkProcessXor.fromFile(dataFileName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
