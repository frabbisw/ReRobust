public static int choose_num(int x, int var) {
    if (x > var)
        return -1;
    if ((var % 2) == 0)
        return var;
    if (x == var)
        return -1;
    return var - 1;
}
