public static int x_or_y(int n, int x, int y) {
    if (n == 1)
        return y;
    for (int i = 2; n > i; i += 1) {
        if (n % i == 0)
            return x;
    }
    return y;
}
