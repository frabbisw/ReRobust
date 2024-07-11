public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y && (int) z == z) {
        if (y + z == x || x + y == z || x + z == y)
            return true;
    }
    return false;
}
