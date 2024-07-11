public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y) {
        if (x + z == y || x + y == z)
            return true;
    }
    return false;
}
