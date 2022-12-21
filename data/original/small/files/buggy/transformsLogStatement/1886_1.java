@java.lang.Override
public void testLoad() throws java.io.IOException {
    System.out.println("log");
    io.kaitai.struct.testformats.BenchmarkProcessXor r = io.kaitai.struct.testformats.BenchmarkProcessXor.fromFile(dataFileName());
}
