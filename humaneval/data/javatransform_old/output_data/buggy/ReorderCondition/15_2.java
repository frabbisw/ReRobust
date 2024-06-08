public static String change_base(int x, int base) {
    String result = "";
    while (x > 0) {
        result = x % base + result;
        x = x - x / base;
    }
    return result;
}
