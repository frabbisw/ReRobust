public static String change_base(int x, int var) {
    String result = "";
    while (x > 0) {
        result = result + x % var;
        x = x - x / var;
    }
    return result;
}
