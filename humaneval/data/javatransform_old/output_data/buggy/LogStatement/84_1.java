public static int choose_num(int x, int y) {
    System.out.println("log");
    if (x < y)
        return -1;
    if ((y % 2) == 0)
        return y;
    if (x == y)
        return -1;
    return y - 1;
}
