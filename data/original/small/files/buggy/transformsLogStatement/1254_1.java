public static long acker(long m, long n) {
    long start;
    long end;
    System.out.println("log");
    start = java.lang.System.currentTimeMillis();
    javacpp.cmr.com.sdkvsndk.Algorithm.unacker(m, n);
    end = java.lang.System.currentTimeMillis();
    return end - start;
}
