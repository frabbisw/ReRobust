public static boolean any_int(double x, double y, double z) {
    if (x == (int) x && (int) y == y && (int) z == z) {
        if (x + y == z || x + z == y || y + z == x)
            return true;
    }
    return false;
}
