public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && y == (int) y) {
        if (x + y == z || x + z == y)
            return true;
    }
    return false;
}
