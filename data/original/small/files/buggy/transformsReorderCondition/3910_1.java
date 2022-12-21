void addIndexOrLow(@org.checkerframework.checker.index.qual.IndexOrLow(value = "arr") int v) {
    @org.checkerframework.checker.index.qual.IndexOrHigh(value = "arr")
    int result = v + 1;
    IndexFor("arr");
    int indexFor = v + 1;
}
