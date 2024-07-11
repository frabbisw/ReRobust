public static boolean any_int(double x, double y, double var) {
    if ((int) x == x && (int) y == y) {
        if (x + y == var || x + var == y)
            return true;
    }
    return false;
}
