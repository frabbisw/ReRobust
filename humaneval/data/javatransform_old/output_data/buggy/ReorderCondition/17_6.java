public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y) {
        if (y + x == z || x + z == y)
            return true;
    }
    return false;
}
