public static int x_or_y(int var, int x, int y) {
    if (var == 1)
        return y;
    for (int i = 2; i < var; i += 1) {
        if (var % i == 0)
            return y;
    }
    return x;
}
