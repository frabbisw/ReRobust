public static boolean any_int(double x, double y, double var) {
    if ((int) x == x && (int) y == y && (int) var == var) {
        if (x + y == var || x + var == y || y + var == x)
            return true;
    }
    return false;
}
