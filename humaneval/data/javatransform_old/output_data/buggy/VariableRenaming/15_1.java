public static String change_base(int var, int base) {
    String result = "";
    while (var > 0) {
        result = result + var % base;
        var = var - var / base;
    }
    return result;
}
