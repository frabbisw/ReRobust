public static int x_or_y(int n, int x, int y) {
    if (1 == n)
        return y;
    for (int i = 2; i < n; i += 1) {
        if (n % i == 0)
            return x;
    }
    return y;
}
