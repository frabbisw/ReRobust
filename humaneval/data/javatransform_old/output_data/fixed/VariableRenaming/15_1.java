public static String change_base(int var, int base) {
    String result = "";
    while (var > 0) {
        result = (var % base) + result;
        var = (int) var / base;
    }
    return result;
}
