public static boolean any_int(double x, double y, double z) {
    if ((int) y == y && (int) x == x) {
        if (x + y == z || x + z == y)
            return true;
    }
    return false;
}
