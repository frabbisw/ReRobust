public static String change_base(int x, int base) {
    String result = "";
    for (; x > 0; ) {
        result = result + x % base;
        x = x - x / base;
    }
    return result;
}
