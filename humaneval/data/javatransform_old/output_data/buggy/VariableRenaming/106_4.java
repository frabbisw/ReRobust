public static int x_or_y(int n, int x, int y) {
    if (n == 1)
        return y;
    for (int var = 2; var < n; var += 1) {
        if (n % var == 0)
            return x;
    }
    return y;
}
