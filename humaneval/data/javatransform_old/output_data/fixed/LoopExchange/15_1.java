public static String change_base(int x, int base) {
    String result = "";
    for (; x > 0; ) {
        result = (x % base) + result;
        x = (int) x / base;
    }
    return result;
}
