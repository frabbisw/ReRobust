public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y && (int) z == z) {
        if (x + y == z || y == x + z || y + z == x)
            return true;
    }
    return false;
}
