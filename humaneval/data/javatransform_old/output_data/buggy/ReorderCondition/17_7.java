public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y) {
        if (x + y == z || y == x + z)
            return true;
    }
    return false;
}
