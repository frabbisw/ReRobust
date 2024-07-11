public static int x_or_y(int n, int x, int var) {
    if (n == 1)
        return var;
    for (int i = 2; i < n; i += 1) {
        if (n % i == 0)
            return var;
    }
    return x;
}
