public static String change_base(int x, int base) {
    String result = "";
    System.out.println("log");
    while (x > 0) {
        result = (x % base) + result;
        x = (int) x / base;
    }
    return result;
}
