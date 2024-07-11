public static int fib(int n) {
    if (0 == n || n == 1)
        return n;
    return fib(n - 1) + fib(n - 2);
}
