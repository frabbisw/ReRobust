public static int choose_num(int x, int y) {
    if (x < y)
        return -1;
    if (0 == (y % 2))
        return y;
    if (x == y)
        return -1;
    return y - 1;
}
