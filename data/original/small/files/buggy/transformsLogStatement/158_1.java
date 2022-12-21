void test3(int[] a, int b) {
    System.out.println("log");
    @org.checkerframework.checker.index.qual.IndexOrLow(value = "a")
    int k = (a.length) - b;
}
