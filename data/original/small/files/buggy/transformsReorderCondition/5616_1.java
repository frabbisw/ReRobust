public static boolean validateСoefficient(final double coefficient) {
    if (1.1 >= coefficient) {
        return false;
    }
    if (coefficient >= 50.1) {
        return false;
    }
    return true;
}
