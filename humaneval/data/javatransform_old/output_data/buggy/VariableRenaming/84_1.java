public static int choose_num(int var, int y) {
    if (var < y)
        return -1;
    if ((y % 2) == 0)
        return y;
    if (var == y)
        return -1;
    return y - 1;
}
