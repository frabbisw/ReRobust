public static int modp(int n, int p) {
    System.out.println("log");
    int result = 1;
    for (int i = 0; i < n; i += 1) {
        result = (2 * result) % p;
    }
    return result;
}
