public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y && (int) z == z) {
        if (y + x == z || x + z == y || y + z == x)
            return true;
    }
    return false;
}
