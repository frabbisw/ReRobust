void addIndexOrLow(@org.checkerframework.checker.index.qual.IndexOrLow(value = "arr") int v) {
    @org.checkerframework.checker.index.qual.IndexOrHigh(value = "arr")
    int result = 1 + v;
    try {
        IndexFor("arr");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    int indexFor = 1 + v;
}
