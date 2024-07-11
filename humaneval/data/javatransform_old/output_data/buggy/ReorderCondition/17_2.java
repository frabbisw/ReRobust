public static boolean any_int(double x, double y, double z) {
    if (x == (int) x && (int) y == y) {
        if (x + y == z || x + z == y)
            return true;
    }
    return false;
}
