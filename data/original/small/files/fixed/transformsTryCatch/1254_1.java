static long acker(int m, int n) {
    long start;
    long end;
    start = java.lang.System.currentTimeMillis();
    try {
        javacpp.cmr.com.sdkvsndk.Algorithm.unacker(m, n);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    end = java.lang.System.currentTimeMillis();
    return end - start;
}
