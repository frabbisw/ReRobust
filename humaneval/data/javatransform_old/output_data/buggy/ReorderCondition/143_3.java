public static int fibfib(int n) {
    if (n == 0)
        return 0;
    if (n == 1)
        return 0;
    return fibfib(n - 3) + fibfib(n - 1) + fibfib(n - 2);
}
