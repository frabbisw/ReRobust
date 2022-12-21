void addIndexOrLow(@org.checkerframework.checker.index.qual.IndexOrLow(value = "arr") int v) {
    @org.checkerframework.checker.index.qual.IndexOrHigh(value = "arr")
    int result = 1 + v;
    IndexFor("arr");
    System.out.println("log");
    int indexFor = 1 + v;
}
