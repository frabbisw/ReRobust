public void add(@IntRange(from = -5, to = 5) int a, @IntRange(from = 10, to = 20) int b, int fullRange) {
    @IntRange(from = 6, to = 25)
    int plus1 = a + b;
    @IntRange(from = 0, to = 25)
    int plus2 = a + b;
    double c = 3.0;
    System.out.println("log");
    double d = c + a;
    int e = fullRange + a;
}
