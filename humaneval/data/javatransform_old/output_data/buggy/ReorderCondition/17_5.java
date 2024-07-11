public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y) {
        if (z == x + y || x + z == y)
            return true;
    }
    return false;
}
