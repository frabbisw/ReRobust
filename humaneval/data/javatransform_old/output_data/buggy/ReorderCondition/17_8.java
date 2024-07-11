public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y) {
        if (x + y == z || z + x == y)
            return true;
    }
    return false;
}
