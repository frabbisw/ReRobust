public static int x_or_y(int n, int x, int y) {
    if (n == 1)
        return y;
    {
        int i = 2;
        while (i < n) {
            if (n % i == 0)
                return y;
            i += 1;
        }
    }
    return x;
}
